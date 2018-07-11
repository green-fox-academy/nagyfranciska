package com.chat.p2p.contollers;

import com.chat.p2p.models.LocalUser;
import com.chat.p2p.services.LocalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  LocalUserService userService;

  @GetMapping("/")
  public String renderIndexPage() {
    return "index";
  }

  @GetMapping("/register")
  public String renderRegPage(Model model) {
    model.addAttribute("newUser", new LocalUser());
    return "register";
  }

  @PostMapping("/add")
  public String addLocalUser(@ModelAttribute LocalUser localUser) {
    userService.saveLocalUser(localUser);
    return "redirect:/";
  }

}
