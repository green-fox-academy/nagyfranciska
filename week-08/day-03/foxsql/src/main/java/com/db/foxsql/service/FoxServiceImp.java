package com.db.foxsql.service;

import com.db.foxsql.model.Fox;
import com.db.foxsql.repository.FoxRepo;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImp implements FoxService {

  FoxRepo foxRepo;

  public FoxServiceImp(FoxRepo foxRepo) {
    this.foxRepo = foxRepo;
  }

  @Override
  public void login(String fox) {
    if (foxRepo.findFoxByName(fox) == null) {
      Fox pet = new Fox(fox);
      foxRepo.save(pet);
    }
  }

  @Override
  public Fox getFox(String fox) {
    return foxRepo.findFoxByName(fox);
  }
}
