package animals;

public class Reptile extends Animal {

  public Reptile() {
  }
  public Reptile(String name) {
    setName(name);
  }

  public String breed() {
    return super.breed();
  }

}
