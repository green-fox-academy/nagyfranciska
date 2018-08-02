package com.app.workshop.services;

import com.app.workshop.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

  List<Movie> findAllMovies();
  void save(Movie movie);

}
