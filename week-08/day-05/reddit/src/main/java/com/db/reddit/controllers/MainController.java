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

  @PostMapping("/login")
  public String login(@RequestParam("username") String username, @RequestParam("email") String email) {
    if (!authorService.validator(email)) {
      return "redirect:/logerror";
    }
    authorService.login(username, email);
    return "redirect:/list";
  }

  @GetMapping("logerror")
  public String logerror() {
    return "logerror";
  }

  @GetMapping("/list")
  public String renderTopList(Model model) {
    model.addAttribute("posts", postService.findAll());
    return "list";
  }

  @GetMapping("/submit")
  public String renderSubmit() {
    return "submit";
  }

  @PostMapping("/newPost")
  public String newPost(@RequestParam("title") String title, @RequestParam("content") String content) {
    if (!postService.validator(content)) {
      return "redirect:/suberror";
    }
    postService.save(title, content);
    return "redirect:/list";
  }

  @GetMapping()
  public String suberror() {
  return "suberror";
  }
}
