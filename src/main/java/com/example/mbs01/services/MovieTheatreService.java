package com.example.mbs01.services;


import com.example.mbs01.entities.MovieTheatre;
import com.example.mbs01.exceptions.MovieDetailsNotFoundException;
import com.example.mbs01.exceptions.MovieTheatreDetailsNotFoundException;
import com.example.mbs01.exceptions.TheatreDetailsNotFoundException;

import java.util.List;

public interface MovieTheatreService {
    public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre) throws MovieDetailsNotFoundException,
            TheatreDetailsNotFoundException;
    public MovieTheatre getMovieTheatreDetails(int id) throws MovieTheatreDetailsNotFoundException;
    public boolean deleteMovieTheatre(int id) throws MovieTheatreDetailsNotFoundException;
    public List<MovieTheatre> getAllMovieTheatreDetails();
}