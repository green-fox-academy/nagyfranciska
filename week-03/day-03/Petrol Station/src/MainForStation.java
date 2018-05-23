public class MainForStation {
  public static void main(String[] args) {

    Car car = new Car();
    Station station = new Station();

    car.gasAmount = 40;

    System.out.println(station.refill(car));

  }
}
