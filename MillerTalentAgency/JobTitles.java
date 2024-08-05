package com.example.millertalentagency.entity;

import javax.persistence.*;

@Entity
public class JobTitles {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    // getters and setters
}
