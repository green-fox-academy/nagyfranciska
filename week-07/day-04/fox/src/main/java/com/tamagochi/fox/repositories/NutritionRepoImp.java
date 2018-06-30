package com.tamagochi.fox.repositories;

import com.tamagochi.fox.models.Drink;
import com.tamagochi.fox.models.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Primary
@Component
public class NutritionRepoImp implements NutritionRepo {

  private List<Food> foodList;
  private List<Drink> drinkList;

  public NutritionRepoImp() {
    foodList = new ArrayList<>();
    drinkList = new ArrayList<>();

    foodList.add(new Food("frog"));
    foodList.add(new Food("duck"));
    foodList.add(new Food("chicken"));
    foodList.add(new Food("stag"));

    drinkList.add(new Drink("water"));
    drinkList.add(new Drink("blood"));
    drinkList.add(new Drink("juice"));
    drinkList.add(new Drink("coffee"));
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
