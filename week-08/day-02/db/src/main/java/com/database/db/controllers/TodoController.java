package com.database.db.controllers;

import com.database.db.models.Todo;
import com.database.db.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    return "redirect:";
  }

  @GetMapping("/{id}")
  public String renderEdit(@PathVariable("id") String id, Model model) {
    model.addAttribute("id", id);
    return "edit";
  }

  @GetMapping("/editTodo")
  public String editTodo(@RequestParam(value = "id") String id, @RequestParam("description") String description, @RequestParam("urgent") Boolean urgent, @RequestParam("done") Boolean done) {
    Long todoID = Long.parseLong(id);
    Todo todo = todoRepo.findTodoById(todoID);
    if (description.isEmpty()) {
    } else {
      todo.setTitle(description);
    }
    todo.setUrgent(urgent);
    todo.setDone(done);
    todoRepo.save(todo);
    return "redirect:";
  }
}