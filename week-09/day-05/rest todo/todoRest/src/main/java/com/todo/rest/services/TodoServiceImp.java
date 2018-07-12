package com.todo.rest.services;

import com.todo.rest.models.Todo;
import com.todo.rest.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImp implements TodoService {

  @Autowired
  TodoRepo todoRepo;

  @Override
  public List<Todo> findAll() {
    List<Todo> todos = new ArrayList<>();
    todoRepo.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public Todo findById(long id) {
    return todoRepo.findById(id);
  }

  @Override
  public void save(Todo todo) {
    todoRepo.save(todo);
  }

  @Override
  public void delete(long id) {
    Todo todo = todoRepo.findById(id);
    todoRepo.delete(todo);
  }

  @Override
  public List<Todo> findAllUrgent() {
    List<Todo> urgentTodos = new ArrayList<>();
    urgentTodos.addAll(todoRepo.findAllByUrgentIsTrue());
    return urgentTodos;
  }

  @Override
  public List<Todo> filteredList(String filter) {
    return todoRepo.findAllByDescriptionContaining(filter);
  }
}
