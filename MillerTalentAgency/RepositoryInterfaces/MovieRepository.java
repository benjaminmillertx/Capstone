package com.example.millertalentagency.repository;

import com.example.millertalentagency.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
