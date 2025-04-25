package com.example.lab3.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @Column(name = "job_id")
    private String id;

    @Column(name = "job_title")
    private String titulo;

    // Getters y setters

    public Job(String id) {
        this.id = id;
    }
}

