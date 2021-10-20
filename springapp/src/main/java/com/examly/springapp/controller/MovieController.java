package com.examly.springapp.controller;

import com.examly.springapp.repository.MovieDao;

import java.util.List;

import com.examly.springapp.models.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MovieController {
    
    @Autowired
    private MovieDao moviedao;

    @PostMapping("/movie")
    public Movie saveUser(@RequestBody Movie movie){
        moviedao.save(movie);
        return movie;
    }
}
