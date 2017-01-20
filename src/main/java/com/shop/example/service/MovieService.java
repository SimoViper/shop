package com.shop.example.service;

import com.shop.example.dto.FilmDetails;

public interface MovieService {

    FilmDetails getFilmDetailsByTitle(String title);

}
