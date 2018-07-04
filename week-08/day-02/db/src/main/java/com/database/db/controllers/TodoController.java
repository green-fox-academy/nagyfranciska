package com.database.db.controllers;

import com.database.db.models.Todo;
import com.database.db.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoRepo todoRepo;


  @GetMapping("")
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
    return "redirect:";
  }

  @GetMapping("/edit/{id}")
  public String renderEdit() {
    return "edit";
  }

//  @GetMapping("editTodo")
//  public String editTodo() {
//    return "redirect:";
//  }
}
