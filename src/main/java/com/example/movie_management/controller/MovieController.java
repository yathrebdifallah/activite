package com.example.movie_management.controller;

import com.example.movie_management.model.Movie;
import com.example.movie_management.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> getAll() { return service.getAll(); }
    @PostMapping
    public Movie create(@RequestBody Movie m) { return service.save(m); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
