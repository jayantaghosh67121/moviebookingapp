package com.example.mbs01.daos;
import com.example.mbs01.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}

