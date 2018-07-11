package com.exam.trial.controllers;

import com.exam.trial.models.Attraction;
import com.exam.trial.services.AttrServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  AttrServiceImp attrService;

  @GetMapping("/")
  public String renderMainPage(Model model) {
    model.addAttribute("attractions", attrService.getAll());
    model.addAttribute("newAttr", new Attraction());
    return "index";
  }

  @PostMapping("/add")
  public String addNewAttraction(@ModelAttribute Attraction attraction) {
    attrService.save(attraction);
    return "redirect:/";
  }
}
