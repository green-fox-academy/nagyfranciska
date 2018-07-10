package com.exam.trial.controllers;

import com.exam.trial.services.AttrServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  AttrServiceImp attrService;

  @GetMapping("/")
  public String renderMainPage(Model model) {
    model.addAttribute("attractions", attrService.getAll());
    return "index";
  }
}
