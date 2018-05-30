package GardenApplication;

public class Plant {

  private String color;
  private String type;
  private double waterLevel;
  private double waterAbsorb;
  private double waterMin;

  public Plant() {
    color = "green";
    type = "unknown";
  }

  public Plant(String color, String type) {
    this.color = color;
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public double getWaterAbsorb() {
    return waterAbsorb;
  }


  public void setWaterAbsorb(double waterAbsorb) {
    this.waterAbsorb = waterAbsorb;
  }

  public double getWaterMin() {
    return waterMin;
  }

  public void setWaterMin(double waterMin) {
    this.waterMin = waterMin;
  }
}

