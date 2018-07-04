package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("number", counter.incrementAndGet());
    return "greeting";
  }
}
