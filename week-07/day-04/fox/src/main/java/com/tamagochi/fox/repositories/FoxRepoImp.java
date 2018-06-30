package com.tamagochi.fox.repositories;

import com.tamagochi.fox.models.Fox;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Primary
@Component
public class FoxRepoImp implements FoxRepo {

  private Map<String, Fox> foxes;

  public FoxRepoImp() {
    foxes = new HashMap<>();
  }

  @Override
  public void save(Fox fox) {
    foxes.put(fox.getName(), fox);
  }

  @Override
  public Fox findFoxByName(String foxName) {
    return foxes.get(foxName);
  }
}
