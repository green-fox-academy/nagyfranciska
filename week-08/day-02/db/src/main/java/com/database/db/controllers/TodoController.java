package com.database.db.controllers;

import com.database.db.models.Todo;
import com.database.db.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  @Autowired
  TodoRepo todoRepo;


  @GetMapping(value = {"", "/"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepo.findAll());
    return "todolist";
  }

  @GetMapping("/add")
  public String add() {
    return "add";
  }

  @GetMapping("/addNewTodo")
  public String addTodo(@RequestParam("todo") String description) {
    Todo todo = new Todo(description);
    todoRepo.save(todo);
    return "redirect:/";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam("id") String id) {
    Long todoID = Long.parseLong(id);
    Todo todo = todoRepo.findTodoById(todoID);
    todoRepo.delete(todo);
    return "redirect:/";
  }

  @GetMapping("/edit")
  public String renderEdit(@RequestParam("id") String id, Model model) {
    Long todoID = Long.parseLong(id);
    Todo todo = todoRepo.findTodoById(todoID);
    model.addAttribute("todo", todo);
    return "edit";
  }

  @GetMapping("/editTodo")
  public String editTodo(@RequestParam("id") String id, @RequestParam("description") String description, @RequestParam(name = "urgent", required = false) Boolean urgent, @RequestParam(name = "done", required = false) Boolean done) {
    Long todoID = Long.parseLong(id);
    Todo todo = todoRepo.findTodoById(todoID);
    todo.setTitle(description);
    if (urgent == null) {
      todo.setUrgent(false);
    } else {
    todo.setUrgent(true);
    }
    if (done == null) {
      todo.setDone(false);
    } else {
      todo.setDone(true);
    }
    todoRepo.save(todo);
    return "redirect:/";
  }
}