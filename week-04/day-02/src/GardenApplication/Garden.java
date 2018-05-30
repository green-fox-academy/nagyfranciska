package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private String name;
  private List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Plant> getPlants() {
    return plants;
  }

  public void setPlants(List<Plant> plants) {
    this.plants = plants;
  }

  public void gardenInfo() {
    for (Plant plant : plants) {
      if (plant.getWaterLevel() < plant.getWaterMin()) {
        System.out.println("The " + plant.getColor() + " " + plant.getType() + " needs water.");
      } else {
        System.out.println("The " + plant.getColor() + " " + plant.getType() + " doesn't need water.");
      }
    }
  }

  public int counter() {
    int counter = 0;
    for (Plant plant : plants) {
      if ( plant.getWaterLevel() < plant.getWaterMin()) {
        counter ++;
      }
    }
    return counter;
  }

  public void waterPlants(int waterAmount) {
    System.out.println("Water the garden.");
    waterAmount /= counter();
    for (Plant plant : plants) {
      if ( plant.getWaterLevel() < plant.getWaterMin()) {
        plant.setWaterLevel(waterAmount * plant.getWaterAbsorb());
      }
    }
  }
}
