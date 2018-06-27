package com.dependencyproject.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Color implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.color("red");
  }
}
