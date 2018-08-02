package com.app.workshop.controllers;

import com.app.workshop.models.Movie;
import com.app.workshop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieRestController {

  @Autowired
  MovieService movieService;

  @GetMapping("/list")
  public ResponseEntity<?> renderMovieList() {
    List<Movie> movieList = movieService.findAllMovies();
    return ResponseEntity.status(HttpStatus.OK).body(movieList);
  }

  @PostMapping("/add")
  public ResponseEntity<?> addNewMovie(@RequestBody Movie movie) {
    movieService.save(movie);
    return ResponseEntity.status(HttpStatus.CREATED).body("Movie is saved");
  }
}
