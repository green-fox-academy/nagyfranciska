package com.todo.rest.repositories;

import com.todo.rest.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Long> {

  Todo findById(long id);
  List<Todo> findAllByUrgentIsTrue();
  List<Todo> findAllByDescriptionContaining(String filterWord);

}
