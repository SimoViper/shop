package com.shop.example.service;

import com.shop.example.dto.FilmDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public FilmDetails getFilmDetailsByTitle(String title) {
        return restTemplate.getForObject("http://172.17.0.3:8095/movies/movie-details/"+title, FilmDetails.class);
    }
}
