package com.example.spring_cinema.services;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    private ArrayList<Movie> movies;


    public Movie addMovie(Movie movie){
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getAllMovies(){
        List<Movie> allMovies = movieRepository.findAll();
        return allMovies;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public Optional<Movie> getMovieById(long id){
        return movieRepository.findById(id);
    }
}
