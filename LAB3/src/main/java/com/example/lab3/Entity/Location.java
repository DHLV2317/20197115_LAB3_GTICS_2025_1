package com.example.lab3.Entity;
import jakarta.persistence.;
@Entity
@Table(name = "locations")
public class Location {

    @Id
    @Column(name = "location_id")
    private String id;

    @Column(name = "city")
    private String ciudad;

    @Column(name = "postal_code")
    private String codigoPostal;

    // Getters y setters

    public Location() {

    }
}

