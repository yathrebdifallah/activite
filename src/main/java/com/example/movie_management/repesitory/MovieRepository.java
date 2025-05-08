package com.example.movie_management.repesitory;

import com.example.movie_management.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}


