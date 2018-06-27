package com.bankofsimba.bankofsimba.model;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount() {
    this("owner", 0, "unknown", false, false);
  }

  public BankAccount(String owner, int balance, String type, boolean isKing, boolean isGood) {
    this.name = owner;
    this.balance = balance;
    this.animalType = type;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }
}
