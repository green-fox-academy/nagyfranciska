package com.dependencyproject.di.controllers;

import com.dependencyproject.di.sevices.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

  public static final String validEmail = "try@out.com";
  public static final String hiddenMessage = "Let me see if you can script me!";
  public static final int userNumber = 1;

  @Autowired
  private UtilityService us;

  @GetMapping("/useful")
  public String showUsefulPage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColoredPage(Model model) {
    model.addAttribute("color", us.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String showEmailPage(@RequestParam("email") String emailAddress, Model model) {
    model.addAttribute("email", String.format(validEmail, emailAddress));
    model.addAttribute("valid", us.validateEmail(emailAddress));
    return "email";
  }

  @GetMapping("/useful/code")
  public String codeText(Model model) {
    model.addAttribute("hidden", us.caesar(hiddenMessage, userNumber));
    return "code";
  }

  @GetMapping("/useful/decode")
  public String decodeText(Model model) {
    model.addAttribute("hidden", us.caesar(hiddenMessage, -userNumber));
    return "code";
  }
}
