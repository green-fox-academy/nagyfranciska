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
    String sound = "Twang";
  }
}
