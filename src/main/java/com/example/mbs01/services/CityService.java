package com.example.mbs01.services;


import com.example.mbs01.entities.City;
import com.example.mbs01.exceptions.CityDetailsNotFoundException;

import java.util.List;

public interface CityService {

    public City acceptCityDetails(City city);
    public List<City> acceptMultipleCityDetails(List<City> cities);
    public City updateCityDetails(int id, City city) throws CityDetailsNotFoundException;
    public City getCityDetails(int id) throws CityDetailsNotFoundException;
    public City getCityDetailsByCityName(String cityName) throws CityDetailsNotFoundException;
    public boolean deleteCity(int id) throws CityDetailsNotFoundException;
    public List<City> getAllCityDetails();
}