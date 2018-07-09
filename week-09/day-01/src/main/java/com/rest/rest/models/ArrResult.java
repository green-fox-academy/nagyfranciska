package com.rest.rest.models;

import java.util.ArrayList;

public class ArrResult {

  private ArrayList<Integer> result;

  public ArrResult() {
  }

  public ArrResult(ArrayList<Integer> result) {
    this.result = result;
  }

  public ArrayList<Integer> getResult() {
    return result;
  }

  public void setResult(ArrayList<Integer> result) {
    this.result = result;
  }
}
