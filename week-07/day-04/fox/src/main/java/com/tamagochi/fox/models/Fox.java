package com.tamagochi.fox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  public Fox() {
    this("Vuk");
  }

  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    this.food = "salad";
    this.drink = "water";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void addTrick(String newTrick) {
    tricks.add(newTrick);
  }
}
