package com.example.spring_cinema.controllers;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.services.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value= "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public Movie newMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }

    @GetMapping
    public List<Movie> allMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping(value = "/{id}")
    public Optional<Movie> getMovieById(@PathVariable long id){
        return movieService.getMovieById(id);

    }


}
