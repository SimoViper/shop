package com.shop.example.service;

import com.shop.example.configuration.Properties;
import com.shop.example.dto.FilmDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Properties properties;

    @Override
    public FilmDetails getFilmDetailsByTitle(String title) {
        return restTemplate.getForObject(properties.getMovies().getMovieDetailsEndpoint() + title, FilmDetails.class);
    }
}
