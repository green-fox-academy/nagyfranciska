package com.rest.rest.controllers;

import com.rest.rest.models.*;
import com.rest.rest.models.Error;
import com.rest.rest.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControl {

  @Autowired
  RestService restService;

  @GetMapping("/doubling")
  public Object Doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return (new Doubling(input));
    }
    return (new Error("Please provide an input!"));
  }

  @GetMapping("/greeter")
  public Object Greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return (new Greeter(name, title));
    }
    return (new Error("Please provide a name!"));
  }

  @GetMapping("/appenda/{appendable}")
  public Object AppendA(@PathVariable(value = "appendable") String appendable) {
    return (new AppendA(appendable));
  }

  @PostMapping("/dountil/{what}")
  public Object DoUntil(@PathVariable(value = "what") String what, @RequestBody(required = false) DoUntil doUntil) {
    if (doUntil == null) {
      return (new Error("Please provide a number!"));
    }
    return new Result(restService.operatorChecker(what, doUntil.getUntil()));
  }

//  @PostMapping("/arrays")
//  public Object ArrayHandler(@RequestBody(required = false) Arrays arrays ) {
//    if (arrays == null) {
//      return new Error("Please provide what to do with the numbers!");
//    } else if (arrays.getWhat().equals("sum")) {
//      return new Result(restService.operatorChecker("sum", arrays.);
//    }
//    return arrays;
//  }
}
