package com.example.movie_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String director;
    private int year;
    // Getters/Setters
}
