package com.example.Relationship.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
//one to one//
//Bi-directional mapping//

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="student1")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String department;
    @OneToOne(mappedBy = "student")

    private Laptop laptop;

}
