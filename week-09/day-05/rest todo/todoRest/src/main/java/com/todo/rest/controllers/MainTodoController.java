package com.todo.rest.controllers;

import com.todo.rest.models.Todo;
import com.todo.rest.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainTodoController {

  @Autowired
  TodoService todoService;

  @GetMapping("")
  public String renderIndex(Model model, @RequestParam(value = "search", required = false) String search,
                            @RequestParam(value = "urgent", required = false) String urgent,
                            @RequestParam(value = "undone", required = false) String undone) {
    if (search != null) {
      model.addAttribute("todoList", todoService.filteredList(search));
    } else if (urgent != null) {
      model.addAttribute("todoList", todoService.urgentList());
    } else if (undone != null) {
      model.addAttribute("todoList", todoService.undoneList());
    } else {
      model.addAttribute("todoList", todoService.findAll());
    }
    model.addAttribute("newTodo", new Todo());
    return "index";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    todoService.save(todo);
    return "redirect:/";
  }

  @PostMapping("/delete/{id}")
  public String deleteTodo(@PathVariable("id") Long id) {
    todoService.delete(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String renderEditPage(@PathVariable("id") Long id, Model model) {
    model.addAttribute("todo", todoService.findById(id));
    return "edit";
  }

  @PostMapping("/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    todoService.save(todo);
    return "redirect:/";
  }
}
