package com.tamagochi.fox.services;

import com.tamagochi.fox.models.Fox;

public interface FoxService {

  void login(String fox);
  Fox getFox(String fox);
}
