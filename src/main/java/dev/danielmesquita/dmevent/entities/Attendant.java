package dev.danielmesquita.dmevent.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_attendant")
public class Attendant {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(unique = true)
  private String email;

  @ManyToMany(mappedBy = "attendants")
  private Set<Activity> activities = new HashSet<>();

  public Attendant() {}

  public Attendant(Long id, String name, String email, Set<Activity> activities) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.activities = activities;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Set<Activity> getActivities() {
    return activities;
  }

  public void setActivities(Set<Activity> activities) {
    this.activities = activities;
  }
}
