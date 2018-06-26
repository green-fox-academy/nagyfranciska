package com.bankofsimba.bankofsimba.model;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;

  public BankAccount() {
    this("owner", 0, "unknown");
  }

  public BankAccount(String owner, int balance, String type) {
    this.name = owner;
    this.balance = balance;
    this.animalType = type;
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
}
