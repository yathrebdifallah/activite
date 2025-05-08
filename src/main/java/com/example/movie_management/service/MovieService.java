package com.example.movie_management.service;

import com.example.movie_management.model.Movie;
import com.example.movie_management.repesitory.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repo;

    public List<Movie> getAll() { return repo.findAll(); }
    public Movie save(Movie m) { return repo.save(m); }
    public void delete(Long id) { repo.deleteById(id); }
}
