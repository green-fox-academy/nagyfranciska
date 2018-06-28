package com.tamagochi.fox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("")
  public String renderIndexPage() {
    return "index";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String getFoxName(@RequestParam("name") String fox) {
    return "redirect:/" + fox;
  }

  @GetMapping("{fox}")
  public String renderFoxPage(@PathVariable(value = "name") String foxName, Model model) {
    model.addAttribute("fox", foxName);
    return "index";
  }
}
