package animals;
import flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird() {
  }
  public Bird(String name) {
    setName(name);
  }

  public String breed() {
    return super.breed();
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
