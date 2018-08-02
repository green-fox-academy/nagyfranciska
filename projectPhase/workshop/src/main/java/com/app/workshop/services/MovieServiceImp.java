package com.app.workshop.services;

import com.app.workshop.models.Movie;
import com.app.workshop.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService {

  @Autowired
  MovieRepo movieRepo;

  @Override
  public List<Movie> findAllMovies() {
    return movieRepo.findAll();
  }

  @Override
  public void save(Movie movie) {
    movieRepo.save(movie);
  }
}
