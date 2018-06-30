package com.tamagochi.fox.repositories;

import com.tamagochi.fox.models.Trick;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Primary
@Component
public class TrickRepoImp implements TrickRepo{

  private List<Trick> trickList;

  public TrickRepoImp() {
    trickList = new ArrayList<>();
    trickList.add(new Trick("sit"));
    trickList.add(new Trick("sleep"));
    trickList.add(new Trick("hunt"));
  }

  @Override
  public List getTricks() {
    return trickList;
  }
}
