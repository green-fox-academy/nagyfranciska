package com.database.db.repositories;

import com.database.db.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {

  Todo findTodoById(Long id);

}
