package com.tamagochi.fox.models;

public class Drink {

  public String[] drinkList;

  public Drink() {
    drinkList = new String[] {"water", "blood", "juice"};
  }

  public String[] getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(String[] drinkList) {
    this.drinkList = drinkList;
  }
}
