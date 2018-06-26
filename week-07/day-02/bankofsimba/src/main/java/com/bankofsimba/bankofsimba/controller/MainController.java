package com.bankofsimba.bankofsimba.controller;

import com.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

  public List<BankAccount> accounts;

  @GetMapping("/index")
  public String showIndexPage() {
    return "index";
  }

  @GetMapping("/show")
  public String showBankAccountsPage(Model model) {

    accounts = Arrays.asList(
      new BankAccount("Simba", 2000, "lion"),
      new BankAccount(),
      new BankAccount("Zazu", 50, "tucan")
    );

    model.addAttribute("accounts", accounts);
    model.addAttribute("currency", "Đ");
    return "accounts";
  }
}
