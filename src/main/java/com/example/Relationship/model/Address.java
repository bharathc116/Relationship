package com.example.Relationship.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
//One to One Mapping//
//source side//
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String city;
    private String street;
    private String country;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
