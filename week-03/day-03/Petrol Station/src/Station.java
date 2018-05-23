public class Station {

  int gasAmount;

  public Station() {
    gasAmount = 200;
  }

  public int refill(Car car) {
    this.gasAmount -= (car.capacity - car.gasAmount);
    car.gasAmount += (car.capacity - car.gasAmount);
    return gasAmount;
  }
}
