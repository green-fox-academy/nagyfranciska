package com.tamagochi.fox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<Trick> tricks;
  private List<Food> foods;
  private List<Drink> drinks;

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

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> trickList) {
    this.tricks = trickList;
  }

  public List<Food> getFoods() {
    return foods;
  }

  public void setFoods(List<Food> foods) {
    this.foods = foods;
  }

  public List<Drink> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<Drink> drinks) {
    this.drinks = drinks;
  }
}
