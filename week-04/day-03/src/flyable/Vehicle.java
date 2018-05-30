package flyable;

abstract class Vehicle {

  private int speed;
  private int maxHeight;
  private int numberOfPassengers;

  public Vehicle() {
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(int maxHeight) {
    this.maxHeight = maxHeight;
  }

  public int getNumberOfPassangers() {
    return numberOfPassengers;
  }

  public void setNumberOfPassangers(int numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }

}
