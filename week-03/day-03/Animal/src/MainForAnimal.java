public class MainForAnimal {
  public static void main(String[] args) {

    Animal dog = new Animal();
    Animal cat = new Animal();
    Animal bird = new Animal();

    dog.play();
    cat.eat();
    bird.drink();

    System.out.println(dog.hunger);
    System.out.println(dog.thirst);

    System.out.println(cat.hunger);
    System.out.println(cat.thirst);

    System.out.println(bird.hunger);
    System.out.println(bird.thirst);

  }
}
