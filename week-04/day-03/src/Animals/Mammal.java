package animals;

public class Mammal extends Animal {

  public Mammal() {
  }
  public Mammal(String name) {
    setName(name);
  }

  @Override
  public String breed() {
    String breed = "pushing miniature versions out";
    return breed;
  }
}
