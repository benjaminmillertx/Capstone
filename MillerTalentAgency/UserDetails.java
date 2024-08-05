package com.example.millertalentagency.entity;

import javax.persistence.*;

@Entity
public class UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bio;
    private String photo;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // getters and setters
}
