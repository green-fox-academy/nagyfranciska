package main.java.music;

abstract class StringedInstrument extends Instrument{

  public int numberOfStrings;


  public abstract void sound();

  @Override
  public void play() {
    sound();

  }
}
