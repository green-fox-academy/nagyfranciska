package com.db.foxsql.repository;

import com.db.foxsql.model.Fox;

import java.util.HashMap;
import java.util.Map;

public class FoxRepoImp implements FoxRepo {

  Map <String, Fox> foxes = new HashMap<>();

  @Override
  public void save(Fox fox) {
    foxes.put(fox.getName(), fox);
  }

  @Override
  public Fox findFoxByName(String foxName) {
    return null;
  }
}
