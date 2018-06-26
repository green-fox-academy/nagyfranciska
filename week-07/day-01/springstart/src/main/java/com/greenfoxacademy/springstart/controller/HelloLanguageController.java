package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class HelloLanguageController {

  Random rand = new Random();
  Language lang = new Language();

  @RequestMapping("/web/foreign")
  public String getLanguage(Model model01, Model model02) {
    model01.addAttribute("lang", lang.getHello(rand.nextInt(Language.hellos.length)));
    model02.addAttribute("name", "Roko");
    return "foreign";
  }

  @RequestMapping("/web/foreign")
  public String getSize(Model size) {
    size.addAttribute("size", 10 + rand.nextInt(40));
    return "foreign";
  }

  @RequestMapping("/web/foreign")
  public String getColor(Model r, Model g, Model b) {
    r.addAttribute("red", rand.nextInt(255));
    g.addAttribute("green", rand.nextInt(255));
    b.addAttribute("blue", rand.nextInt(255));
    return "foreign";
  }
}
