package com.db.reddit.controllers;

import com.db.reddit.services.AuthorService;
import com.db.reddit.services.AuthorServiceImp;
import com.db.reddit.services.PostService;
import com.db.reddit.services.PostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private AuthorService authorService;
  private PostService postService;

  @Autowired
  public MainController(AuthorServiceImp authorService, PostServiceImp postService) {
    this.authorService = authorService;
    this.postService = postService;
  }

  @GetMapping(value = {"", "/"})
  public String renderLogin() {
    return "login";
  }

  @PostMapping()
  public String login(@RequestParam("username") String username, @RequestParam("email") String email) {
    if (!authorService.validator(email)) {
      return "redirect:/error";
    }
    authorService.login(username, email);
    return "redirect:/top";
  }

  @GetMapping("error")
  public String error() {
    return "error";
  }

  @GetMapping("/top")
  public String renderTopList() {
    return "toplist";
  }

  @GetMapping("/submit")
  public String renderSubmit() {
    return "submit";
  }

  @GetMapping("/list")
  public String renderList() {
    return "list";
  }
}
