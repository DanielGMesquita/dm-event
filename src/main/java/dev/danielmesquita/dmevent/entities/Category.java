package dev.danielmesquita.dmevent.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_category")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String description;

  @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
  private List<Activity> activities = new ArrayList<>();

  public Category() {}

  public Category(Long id, String description, List<Activity> activities) {
    this.id = id;
    this.description = description;
    this.activities = activities;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Activity> getActivities() {
    return activities;
  }

  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }
}
