package com.jkhhuse.plan.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
@AllArgsConstructor
public class CustomerDO implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;

  public CustomerDO() {

  }

  public CustomerDO(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

}