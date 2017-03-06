package com.shop.example.service;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.shop.example.configuration.Properties;
import com.shop.example.dto.FilmDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService{

    private Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Properties properties;

//    @Autowired
//    private HazelcastInstance client;

    @Override
    public FilmDetails getFilmDetailsByTitle(String title) {

        FilmDetails fm = restTemplate.getForObject(properties.getMovies().getMovieDetailsEndpoint() + title, FilmDetails.class);

//        IMap map = client.getMap("movie");
//
//        if(map != null){
//            log.info("id " + map.get("id"));
//            log.info("Language " + map.get("Language"));
//        }


        return fm;
    }
}
