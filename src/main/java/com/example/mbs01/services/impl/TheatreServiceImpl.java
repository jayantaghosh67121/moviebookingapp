package com.example.mbs01.services.impl;
import com.example.mbs01.entities.Theatre;
import com.example.mbs01.exceptions.TheatreDetailsNotFoundException;
import com.example.mbs01.services.TheatreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {

    @Override
    public Theatre acceptTheatreDetails(Theatre theatre) {
        return null;
    }

    @Override
    public Theatre getTheatreDetails(int id) throws TheatreDetailsNotFoundException {
        return null;
    }

    @Override
    public Theatre updateTheatreDetails(int id, Theatre theatre) throws TheatreDetailsNotFoundException {
        return null;
    }

    @Override
    public boolean deleteTheatre(int id) throws TheatreDetailsNotFoundException {
        return false;
    }

    @Override
    public List<Theatre> getAllTheatreDetails() {
        return null;
    }
}