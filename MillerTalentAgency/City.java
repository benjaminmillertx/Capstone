package com.example.millertalentagency.entity;

import javax.persistence.*;

@Entity
public class City {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // getters and setters
}
