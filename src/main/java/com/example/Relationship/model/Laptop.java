package com.example.Relationship.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)

    private Student student;





//     @OneToOne
//  @JoinColumn(name = "student_id")
//    private Student student;
}
