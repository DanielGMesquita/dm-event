package dev.danielmesquita.dmevent.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "activity_table")
public class Activity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String description;

  private Double price;

  @ManyToMany
  @JoinTable(
      name = "activity_attendant",
      joinColumns = @JoinColumn(name = "activity_id"),
      inverseJoinColumns = @JoinColumn(name = "attendant_id"))
  private Set<Attendant> attendants = new HashSet<>();

  @OneToMany(mappedBy = "activity", cascade = CascadeType.ALL)
  private List<Block> blocks = new ArrayList<>();

  @ManyToOne(optional = false)
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;

  public Activity() {}

  public Activity(
      Long id,
      String name,
      String description,
      Double price,
      Set<Attendant> attendants,
      List<Block> blocks,
      Category category) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.attendants = attendants;
    this.blocks = blocks;
    this.category = category;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Set<Attendant> getAttendants() {
    return attendants;
  }

  public void setAttendants(Set<Attendant> attendants) {
    this.attendants = attendants;
  }

  public List<Block> getBlocks() {
    return blocks;
  }

  public void setBlocks(List<Block> blocks) {
    this.blocks = blocks;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
