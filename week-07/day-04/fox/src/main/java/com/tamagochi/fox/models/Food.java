package com.tamagochi.fox.models;

public class Food {

  private String[] foodList;

  public Food() {
    foodList = new String[] {"frog", "duck", "chicken"};
  }

  public String[] getFoodList() {
    return foodList;
  }

  public void setFoodList(String[] foodList) {
    this.foodList = foodList;
  }
}
