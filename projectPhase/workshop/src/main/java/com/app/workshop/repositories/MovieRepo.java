package com.app.workshop.repositories;

import com.app.workshop.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends CrudRepository<Movie, Long> {
  
  List<Movie> findAll();

}
