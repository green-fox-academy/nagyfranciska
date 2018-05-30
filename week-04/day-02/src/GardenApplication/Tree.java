package GardenApplication;

public class Tree extends Plant {

  public Tree(String color, String type) {
    super(color, type);
  }

  public Tree(String color) {
    setColor(color);
    setType("Tree");
    setWaterLevel(0);
    setWaterMin(10);
    setWaterAbsorb(0.4);
  }



}