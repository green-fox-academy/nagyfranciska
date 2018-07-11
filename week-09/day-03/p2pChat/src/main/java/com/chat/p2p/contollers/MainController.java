package com.chat.p2p.contollers;

import com.chat.p2p.models.Client;
import com.chat.p2p.models.Message;
import com.chat.p2p.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  ClientService clientService;

  @GetMapping("/")
  public String renderIndexPage(Model model) {
    if (clientService.clientExists()) {
    model.addAttribute("client", clientService.getClient());
    model.addAttribute("defaultMessage", new Message("App", "Hi there! Submit your message using the send button!"));
    return "index";
    }
    return "redirect:/register";
  }

  @PostMapping("/update")
  public String updateClient(@ModelAttribute Client client) {
    clientService.update(client);
    return "redirect:/";
  }

  @GetMapping("/register")
  public String renderRegPage(Model model) {
    model.addAttribute("client", new Client());
    return "register";
  }

  @PostMapping("/add")
  public String addClient(@ModelAttribute Client client) {
    if (client != null) {
      clientService.saveClient(client);
      return "redirect:/";
    }
    return "register";
  }

}
