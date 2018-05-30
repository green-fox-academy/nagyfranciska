package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
  }

  public BassGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
    sound();
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}
