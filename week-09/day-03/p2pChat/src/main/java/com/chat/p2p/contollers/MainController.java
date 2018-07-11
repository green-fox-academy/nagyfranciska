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
  public String renderIndexPage(Model model) {
    if (userService.findUser(1) != null) {
    model.addAttribute("localUser", userService.findUser(1));
    return "index";
    }
    return "redirect:/register";
  }

  @PostMapping("/update")
  public String updateUserName(@ModelAttribute LocalUser localUser) {
    userService.deleteAll();
    userService.saveLocalUser(localUser);
    return "redirect:/";
  }

  @GetMapping("/register")
  public String renderRegPage(Model model) {
    model.addAttribute("user", new LocalUser());
    return "register";
  }

  @PostMapping("/add")
  public String addLocalUser(@ModelAttribute LocalUser localUser) {
    if (localUser != null) {
      userService.saveLocalUser(localUser);
      return "redirect:/";
    }
    return "register";
  }

}
