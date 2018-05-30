package animals;

public class Bird extends Animal {

  public Bird() {
  }
  public Bird(String name) {
    setName(name);
  }

  public String breed() {
    return super.breed();
  }
}
