package GardenApplication;

import java.util.ArrayList;
import java.util.Arrays;

public class GardenApp {
  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plant yellowFlower = new Flower("yellow");
    Plant blueFlower = new Flower("yellow");
    Plant orangeTree = new Tree("orange");
    Plant purpleTree = new Tree("purple");

    myGarden.setPlants( new ArrayList<>(Arrays.asList(yellowFlower,
                                                       blueFlower,
                                                       orangeTree,
                                                       purpleTree)));

    myGarden.gardenInfo();
    myGarden.waterPlants(40);
    myGarden.gardenInfo();
    myGarden.waterPlants(70);
    myGarden.gardenInfo();

  }
}
