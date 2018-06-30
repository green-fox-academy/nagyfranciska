package com.tamagochi.fox.models;

public class Trick {

  private String[] trickList;

  public Trick() {
    trickList = new String[]{"sit", "sleep", "hunt"};
  }

  public String[] getTrickList() {
    return trickList;
  }

  public void setTrickList(String[] tricks) {
    this.trickList = tricks;
  }
}
