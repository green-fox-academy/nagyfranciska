package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
  }

  public ElectricGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
    sound();
  }

  @Override
  public void sound() {
    if (numberOfStrings < 7) {
      System.out.println("Twang");
    } else {
      System.out.println("Twangg");
    }
  }
}
