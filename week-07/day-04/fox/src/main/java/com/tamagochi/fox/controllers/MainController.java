package com.tamagochi.fox.controllers;

import com.tamagochi.fox.repositories.NutritionRepo;
import com.tamagochi.fox.repositories.NutritionRepoImp;
import com.tamagochi.fox.repositories.TrickRepo;
import com.tamagochi.fox.repositories.TrickRepoImp;
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
  private TrickRepo trickRepo;
  private NutritionRepo nutritionRepo;

  @Autowired
  public MainController(FoxServiceImp foxService, TrickRepoImp trickRepo, NutritionRepoImp nutritionRepo) {
    this.foxService = foxService;
    this.trickRepo = trickRepo;
    this.nutritionRepo = nutritionRepo;
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
  public String renderNutritionStore(Model model) {
    model.addAttribute("drinks", nutritionRepo.getDrinks());
    model.addAttribute("foods", nutritionRepo.getFoods());
    return "nutrition";
  }

  @GetMapping("/center")
  public String renderTrickCenter(Model model) {
    model.addAttribute("tricks", trickRepo.getTricks());
    return "trickcenter";
  }
}
