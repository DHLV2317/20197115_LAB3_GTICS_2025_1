package com.example.lab3.Entity;
import jakarta.persistence.;
@Entity
@Table(name = "departments")
public class Deparment {

    @Id
    @Column(name = "department_id")
    private Long id;

    @Column(name = "department_name")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    // Getters y setters
}

