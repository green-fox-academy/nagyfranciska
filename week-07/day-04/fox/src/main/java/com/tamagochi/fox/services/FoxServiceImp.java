package com.tamagochi.fox.services;

import com.tamagochi.fox.models.Fox;
import com.tamagochi.fox.repositories.FoxRepo;
import com.tamagochi.fox.repositories.FoxRepoImp;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImp implements FoxService {

  private FoxRepo foxRepo;

  public FoxServiceImp(FoxRepoImp foxRepo) {
    this.foxRepo = foxRepo;
  }

  @Override
  public void login(String fox) {
    if (foxRepo.findFoxByName(fox) == null) {
      foxRepo.save(new Fox(fox));
    }
  }

  @Override
  public Fox getFox(String fox) {
    return foxRepo.findFoxByName(fox);
  }
}
