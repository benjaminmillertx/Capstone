package com.example.millertalentagency.service;

import com.example.millertalentagency.entity.MovieApplication;
import com.example.millertalentagency.repository.MovieApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private MovieApplicationRepository movieApplicationRepository;

    public List<MovieApplication> findByMovieId(Long movieId) {
        return movieApplicationRepository.findByMovieId(movieId);
    }

    public MovieApplication save(MovieApplication application) {
        return movieApplicationRepository.save(application);
    }
}
