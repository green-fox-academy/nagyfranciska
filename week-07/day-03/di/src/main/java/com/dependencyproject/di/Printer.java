package com.dependencyproject.di;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class Printer {

  public void log(String message){
    System.out.println(LocalDateTime.now() + "MY PRINTER SAYS --- " + message);
  }

  public void color(String color) {
    System.out.println("This color is "  + color);
  }
}


