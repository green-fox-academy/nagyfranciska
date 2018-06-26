package com.bankofsimba.bankofsimba.controller;

import com.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  private List<BankAccount> accounts;

  public MainController() {
    accounts = new ArrayList<>();
  }

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("account", accounts);
    return "index";
  }


}
