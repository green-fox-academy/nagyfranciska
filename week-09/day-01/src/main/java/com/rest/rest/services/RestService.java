package com.rest.rest.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RestService {

  public int operatorChecker(String operator, Integer input) {
    if (operator.equals("sum")) {
      return sumUntil(input);
    }
    return factorUntil(input);
  }

  public int multip(ArrayList<Integer> list) {
    int m = 0;
    for (int i = 0; i < list.size(); i++) {
      m += i;
    }
   return m;
  }

  public ArrayList<Integer> doub(ArrayList<Integer> list) {
    list.stream()
      .map(num -> num * 2);
    return list;
  }

  public Integer sumUntil(Integer input) {
    int s = 0;
    for (int i = 0; i <= input ; i++) {
      s += i;
    }
    return s;
  }

  public Integer factorUntil(Integer input) {
    if (input == 0) {
      return 1;
    }
    int f = 1;
    for (int i = 1; i <= input ; i++) {
      f *= i;
    }
    return f;
  }
}
