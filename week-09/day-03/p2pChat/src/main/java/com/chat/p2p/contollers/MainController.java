package com.chat.p2p.contollers;

import com.chat.p2p.models.Client;
import com.chat.p2p.models.Message;
import com.chat.p2p.services.ClientService;
import com.chat.p2p.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  ClientService clientService;
  @Autowired
  MessageService messageService;

  @GetMapping("/")
  public String renderIndexPage(Model model) {
    if (clientService.clientExists()) {
      model.addAttribute("client", clientService.getClient());
      if (messageService.findAll().size() <= 0) {
        messageService.saveMessage(new Message("App", "Hi there! Submit your message using the send button!"));
      }
      model.addAttribute("messages", messageService.findAll());
      return "index";
    }
    return "redirect:/register";
  }

  @PostMapping("/sendMessage")
  public String sendMessage(@RequestParam("username") String username, @RequestParam("text") String text) {
    messageService.saveMessage(new Message(username, text));
    return "redirect:/";
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
