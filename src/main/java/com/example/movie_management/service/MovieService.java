package com.example.movie_management.service;

import com.example.movie_management.model.Movie;
import com.example.movie_management.repesitory.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repo;

    // Méthode principale pour récupérer tous les films avec cache
    @Cacheable("movies")
    public List<Movie> getAllMovies() {
        System.out.println("Fetching from DB...");
        return repo.findAll();
    }

    // Ajouter un film et vider le cache
    @CacheEvict(value = "movies", allEntries = true)
    public Movie addMovie(Movie m) {
        return repo.save(m);
    }

    // Supprimer un film et vider le cache
    @CacheEvict(value = "movies", allEntries = true)
    public void deleteMovie(Long id) {
        repo.deleteById(id);
    }

    // ✅ Méthodes supplémentaires (utiles si utilisées ailleurs)

    public List<Movie> getAll() {
        return repo.findAll();
    }

    public Movie save(Movie m) {
        return repo.save(m);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
