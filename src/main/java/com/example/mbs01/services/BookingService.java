package com.example.mbs01.services;

import com.example.mbs01.entities.Booking;
import com.example.mbs01.exceptions.BookingDetailsNotFoundException;
import com.example.mbs01.exceptions.MovieTheatreDetailsNotFoundException;
import com.example.mbs01.exceptions.UserDetailsNotFoundException;

import java.util.List;

public interface BookingService {

    public Booking acceptBookingDetails(Booking booking) throws MovieTheatreDetailsNotFoundException,
            UserDetailsNotFoundException;
    public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException;
    public boolean deleteBooking(int id) throws BookingDetailsNotFoundException;
    public List<Booking> getAllBookingDetails();

}