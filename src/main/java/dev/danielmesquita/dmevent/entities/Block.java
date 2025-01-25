package dev.danielmesquita.dmevent.entities;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "block_table")
public class Block {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant startTime;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant endTime;

  @ManyToOne
  @JoinColumn(name = "activity_id")
  private Activity activity;

  public Block() {}

  public Block(Long id, Instant startTime, Instant endTime, Activity activity) {
    this.id = id;
    this.startTime = startTime;
    this.endTime = endTime;
    this.activity = activity;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Instant getStartTime() {
    return startTime;
  }

  public void setStartTime(Instant startTime) {
    this.startTime = startTime;
  }

  public Instant getEndTime() {
    return endTime;
  }

  public void setEndTime(Instant endTime) {
    this.endTime = endTime;
  }

  public Activity getActivity() {
    return activity;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }
}
