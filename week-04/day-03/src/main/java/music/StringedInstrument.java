package main.java.music;

abstract class StringedInstrument extends Instrument{

  int numberOfStrings;
  String name;

  public abstract void sound();

  @Override
  public void play() {
    sound();

  }
}
