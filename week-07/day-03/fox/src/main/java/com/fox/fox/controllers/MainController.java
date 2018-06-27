package com.fox.fox.controllers;

import com.fox.fox.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  StudentService studentService;

  @GetMapping("/gfa")
  public String showMainPage(Model model) {
    model.addAttribute("size", studentService.count());
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String showListPage(Model model) {
    model.addAttribute("studentList", studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String showAddPage() {
    return "add";
  }

  @GetMapping("/gfa/save")
  public String saveNewStudent(@RequestParam("studentName") String name, Model model) {
    studentService.save(name);
    model.addAttribute("name", name);
    return "save";
  }


}
