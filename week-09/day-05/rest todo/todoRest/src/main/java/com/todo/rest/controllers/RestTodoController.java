package com.todo.rest.controllers;

import com.todo.rest.models.Todo;
import com.todo.rest.models.TodoList;
import com.todo.rest.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestTodoController {

  @Autowired
  TodoService todoService;

  //inspect json format of one object
  @GetMapping("/rest")
  public ResponseEntity<?> inspectTodoJSONFormat() {
    Todo todo = todoService.findById(4);
    return ResponseEntity.status(HttpStatus.OK).body(todo);
  }

  //add new todo object to list (give 0 to id, it generates the next one)
  @PostMapping("/restAdd")
  public ResponseEntity<?> receiveTodo(@RequestBody Todo todo) {
    todoService.save(todo);
    return ResponseEntity.status(HttpStatus.CREATED).body(todo);
  }

  //get todos by query as list of another object, after ? url, there can be more than one RequestParam
  @GetMapping("/urgent")
  public ResponseEntity<?> getUrgentTodos(@RequestParam(value = "urgent") Boolean urgent) {
    List<Todo> urgentTodos = todoService.findAllUrgent();
    TodoList todoList = new TodoList(urgentTodos);
    return new ResponseEntity(todoList, HttpStatus.CREATED);
  }
}
