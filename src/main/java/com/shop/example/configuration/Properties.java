package com.shop.example.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="rest-services")
public class Properties {


    private Movies movies = new Movies();



    public static class Movies {
        private String movieDetailsEndpoint;

        public String getMovieDetailsEndpoint() {
            return movieDetailsEndpoint;
        }

        public void setMovieDetailsEndpoint(String movieDetailsEndpoint) {
            this.movieDetailsEndpoint = movieDetailsEndpoint;
        }
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }
}
