package com.todo.rest.services;

import com.todo.rest.models.Todo;

import java.util.List;

public interface TodoService {

  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
  List<Todo> findAllUrgent();
  List<Todo> filteredList(String filter);
}
