package com.example.mbs01.services;

import com.example.mbs01.entities.Theatre;
import com.example.mbs01.exceptions.TheatreDetailsNotFoundException;

import java.util.List;

public interface TheatreService {

    public Theatre acceptTheatreDetails(Theatre theatre);
    public Theatre getTheatreDetails(int id) throws TheatreDetailsNotFoundException;
    public Theatre updateTheatreDetails(int id, Theatre theatre) throws TheatreDetailsNotFoundException;
    public boolean deleteTheatre(int id) throws TheatreDetailsNotFoundException;
    public List<Theatre> getAllTheatreDetails();
}
