package com.tamagochi.fox.repositories;

import com.tamagochi.fox.models.Fox;

public interface FoxRepo {

  void save(Fox fox);
  Fox findFoxByName(String foxName);
}
