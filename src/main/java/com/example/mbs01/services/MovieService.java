package com.example.mbs01.services;

import com.example.mbs01.entities.Movie;
import com.example.mbs01.exceptions.MovieDetailsNotFoundException;

import java.util.List;

public interface MovieService {

    public Movie acceptMovieDetails(Movie movie);

    public Movie getMovieDetails(int movieId) throws MovieDetailsNotFoundException;

    public Movie updateMovieDetails(int movieId , Movie movie) throws MovieDetailsNotFoundException;

    public boolean deleteMovie(int id);

    public List<Movie> getAllMovieDetails();
}