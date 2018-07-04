package com.db.foxsql.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Primary
@Component
public class NutritionRepoImp implements NutritionRepo {

  private List<String> foodList;
  private List<String> drinkList;

  public NutritionRepoImp() {
    foodList = new ArrayList<>();
    drinkList = new ArrayList<>();

    foodList.add("salad");
    foodList.add("frog");
    foodList.add("duck");
    foodList.add("chicken");
    foodList.add("cheese");

    drinkList.add("water");
    drinkList.add("blood");
    drinkList.add("juice");
    drinkList.add("beer");
    drinkList.add("coffee");
  }

  @Override
  public List getDrinks() {
    return drinkList;
  }

  @Override
  public List getFoods() {
    return foodList;
  }
}
