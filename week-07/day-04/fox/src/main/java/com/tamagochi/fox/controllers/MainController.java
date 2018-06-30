package com.tamagochi.fox.controllers;

import com.tamagochi.fox.services.FoxService;
import com.tamagochi.fox.services.FoxServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxServiceImp foxService) {
    this.foxService = foxService;
  }

  @GetMapping("")
  public String renderLoginPage() {
    return "/login";
  }

  @GetMapping("/profile")
  public String renderProfile(@RequestParam("fox") String fox, Model model) {
    foxService.login(fox);
    model.addAttribute("fox", foxService.getFox(fox));
    return "profile";
  }

  @GetMapping("/store")
  public String renderNutritionStore() {
    return "nutrition";
  }

  @GetMapping("/center")
  public String renderTrickCenter() {
    return "trickcenter";
  }
}
