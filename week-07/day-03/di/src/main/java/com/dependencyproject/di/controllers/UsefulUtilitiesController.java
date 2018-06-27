package com.dependencyproject.di.controllers;

import com.dependencyproject.di.sevices.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilitiesController {

  @Autowired
  private UtilityService us;

  @GetMapping("/useful")
  public String showUsefulPage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColoredPage(Model model) {
    model.addAttribute("color", us.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String showEmailPage() {
    return "email";
  }
}
