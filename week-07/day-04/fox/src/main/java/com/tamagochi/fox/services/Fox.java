package com.tamagochi.fox.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fox {

  public static final List<Fox> foxes = new ArrayList<>();
  private String name;
  private List<Trick> listOfTricks;
  public static final String[] food = {"duck", "pizza", "salad", "frog"};
  public static final String[] drink = {"water", "blood", "coke", "juice"};

  public Fox() {
    this.name = "Vuk";
    listOfTricks = new ArrayList<>();
    foxes.add(this);
  }
  public Fox(String name) {
    this.name = name;
    listOfTricks = new ArrayList<>();
    foxes.add(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List<Trick> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public void learnNewTrick(Trick trick) {
    listOfTricks.add(trick);
  }

  public int countTricks() {
    return listOfTricks.size();
  }
}
