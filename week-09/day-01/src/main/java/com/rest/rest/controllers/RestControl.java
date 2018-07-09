package com.rest.rest.controllers;

import com.rest.rest.models.Doubling;
import com.rest.rest.models.Error;
import com.rest.rest.models.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {

  @GetMapping("/doubling")
  public Object renderDoubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return (new Doubling(input));
    }
    return (new Error("Please provide an input!"));
  }

  @GetMapping("/greeter")
  public Object renderGreeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return (new Greeter(name, title));
    }
    return (new Error("Please provide a name!"));
  }
}
