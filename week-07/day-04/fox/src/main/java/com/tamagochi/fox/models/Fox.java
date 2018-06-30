package com.tamagochi.fox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<String> tricks;
  private List<String> foods;
  private List<String> drinks;

  public Fox() {
    this("Vuk");
  }

  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    foods = new ArrayList<>();
    drinks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> trickList) {
    this.tricks = trickList;
  }

  public List<String> getFoods() {
    return foods;
  }

  public void setFoods(List<String> foods) {
    this.foods = foods;
  }

  public List<String> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<String> drinks) {
    this.drinks = drinks;
  }
}
