package com.example.mbs01.daos;

import com.example.mbs01.entities.MovieTheatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MovieTheatreDao extends JpaRepository<MovieTheatre, Integer> {
}