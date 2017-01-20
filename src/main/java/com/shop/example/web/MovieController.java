package com.shop.example.web;

import com.shop.example.dto.FilmDetails;
import com.shop.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET, value = "/movie-details/{title}")
    public @ResponseBody
    FilmDetails getMovieDetails(@PathVariable("title") String title){
        return movieService.getFilmDetailsByTitle(title);
    }

}
