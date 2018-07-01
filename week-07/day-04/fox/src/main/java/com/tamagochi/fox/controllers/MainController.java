package com.tamagochi.fox.controllers;

import com.tamagochi.fox.repositories.NutritionRepo;
import com.tamagochi.fox.repositories.NutritionRepoImp;
import com.tamagochi.fox.repositories.TrickRepo;
import com.tamagochi.fox.repositories.TrickRepoImp;
import com.tamagochi.fox.services.FoxService;
import com.tamagochi.fox.services.FoxServiceImp;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("profile/{fox}/nutrition")
  public String renderNutritionStore(@PathVariable(value ="fox") String fox, Model model) {
    model.addAttribute("drinks", nutritionRepo.getDrinks());
    model.addAttribute("foods", nutritionRepo.getFoods());
    model.addAttribute("fox", foxService.getFox(fox));
    return "nutrition";
  }

  @GetMapping("/feed")
  public String feedFox(@RequestParam("eat") String eat, @RequestParam("drink") String drink, @RequestParam("name") String name) {
    foxService.getFox(name).setDrink(drink);
    foxService.getFox(name).setFood(eat);
    return "redirect: /profile";
  }

  @GetMapping("profile/{fox}/trickcenter")
  public String renderTrickCenter(@PathVariable(value ="fox") String fox, Model model) {
    model.addAttribute("tricks", trickRepo.getTricks());
    model.addAttribute("fox", foxService.getFox(fox));
    return "trickcenter";
  }

  @GetMapping("/learn")
  public String teachFox(@RequestParam("trick") String trick, @RequestParam("fox") String fox) {
    foxService.getFox(fox).addTrick(trick);
    return "redirect:profile?fox=" + fox;
  }
}