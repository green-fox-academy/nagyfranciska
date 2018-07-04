package com.db.foxsql.controller;

import com.db.foxsql.repository.NutritionRepo;
import com.db.foxsql.repository.NutritionRepoImp;
import com.db.foxsql.repository.TrickRepo;
import com.db.foxsql.repository.TrickRepoImp;
import com.db.foxsql.service.FoxService;
import com.db.foxsql.service.FoxServiceImp;
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
  public String feedFox(@RequestParam("food") String food, @RequestParam("drink") String drink, @RequestParam("fox") String fox) {
    foxService.getFox(fox).setDrink(drink);
    foxService.getFox(fox).setFood(food);
    return "redirect:profile?fox=" + fox;
  }

  @GetMapping("profile/{fox}/trickcenter")
  public String renderTrickCenter(@PathVariable(value ="fox") String fox, Model model) {
    model.addAttribute("tricks", trickRepo.getTricks());
    model.addAttribute("fox", foxService.getFox(fox));
    return "trickcenter";
  }

  @GetMapping("/learn")
  public String teachFox(@RequestParam("trick") String trick, @RequestParam("fox") String fox) {
    if (!foxService.getFox(fox).getTricks().contains(trick)) {
      foxService.getFox(fox).addTrick(trick);
    }
    return "redirect:profile?fox=" + fox;
  }

  @GetMapping("/demonstrate")
  public String demonstrateTrick(@RequestParam(name="fox") String fox, @RequestParam(name="position") String position) {
    foxService.getFox(fox).setImage(position);
    return "redirect:profile?fox=" + fox;
  }
}