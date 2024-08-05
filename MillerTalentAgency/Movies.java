package com.example.millertalentagency.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<MovieApplication> applications = new HashSet<>();

    // getters and setters
}
