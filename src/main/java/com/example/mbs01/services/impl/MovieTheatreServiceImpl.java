package com.example.mbs01.services.impl;


import com.example.mbs01.daos.MovieTheatreDao;
import com.example.mbs01.entities.MovieTheatre;
import com.example.mbs01.exceptions.MovieDetailsNotFoundException;
import com.example.mbs01.exceptions.MovieTheatreDetailsNotFoundException;
import com.example.mbs01.exceptions.TheatreDetailsNotFoundException;
import com.example.mbs01.services.MovieService;
import com.example.mbs01.services.MovieTheatreService;
import com.example.mbs01.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieTheatreServiceImpl implements MovieTheatreService {

    @Autowired
    private MovieTheatreDao movieTheatreDao;

    @Autowired
    private TheatreService theatreService;

    @Autowired
    private MovieService movieService;

    @Override
    public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre)
            throws MovieDetailsNotFoundException, TheatreDetailsNotFoundException {
        movieService.getMovieDetails(movieTheatre.getMovie().getMovieId());
        theatreService.getTheatreDetails(movieTheatre.getTheatre().getTheatreId());
        return movieTheatreDao.save(movieTheatre);
    }

    @Override
    public MovieTheatre getMovieTheatreDetails(int id) throws MovieTheatreDetailsNotFoundException {
        return movieTheatreDao.findById(id)
                .orElseThrow(
                        () -> new MovieTheatreDetailsNotFoundException("MovieTheatre not found by id: " + id)
                );
    }

    @Override
    public boolean deleteMovieTheatre(int id) throws MovieTheatreDetailsNotFoundException {
        MovieTheatre movieTheatre = getMovieTheatreDetails(id);
        movieTheatreDao.delete(movieTheatre);
        return true;
    }

    @Override
    public List<MovieTheatre> getAllMovieTheatreDetails() {
        return movieTheatreDao.findAll();
    }
}