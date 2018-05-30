package GardenApplication;

public class Flower extends Plant{

  public Flower(String color, String type) {
    super(color, type);
  }

  public Flower(String color) {
    setColor(color);
    setType("Flower");
    setWaterLevel(0);
    setWaterMin(5);
    setWaterAbsorb(0.75);
  }

}