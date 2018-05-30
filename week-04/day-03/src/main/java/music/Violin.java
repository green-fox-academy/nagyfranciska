package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
  }

  public Violin(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
    sound();
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }
}
