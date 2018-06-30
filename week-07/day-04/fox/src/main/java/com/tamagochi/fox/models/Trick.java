package com.tamagochi.fox.models;

public class Trick {

  private String trick;

  public Trick(String description) {
    this.trick = description;
  }

  public String getTrick() {
    return trick;
  }

  public void setTrick(String trick) {
    this.trick = trick;
  }
}
