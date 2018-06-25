package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model01, Model model02) {
    model01.addAttribute("name", " Roko" + "\'s" + " Basilisk");
    model02.addAttribute("number", counter.incrementAndGet());
    return "greeting";
  }
}
