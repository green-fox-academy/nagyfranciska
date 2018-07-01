package com.tamagochi.fox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<String> tricks;
  private String food;
  private String drink;
  private String image;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    this.food = "salad";
    this.drink = "water";
    this.image = "stand";
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

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
