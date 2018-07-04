package com.db.foxsql.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Primary
@Component
public class TrickRepoImp implements TrickRepo{

  private List<String> trickList;

  public TrickRepoImp() {
    trickList = new ArrayList<>();
    trickList.add("sit");
    trickList.add("sleep");
    trickList.add("hunt");
    trickList.add("code");
  }

  @Override
  public List getTricks() {
    return trickList;
  }
}
