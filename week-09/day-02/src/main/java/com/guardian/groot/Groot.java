package com.guardian.groot;

public class Groot {

  private String received;
  private String translated = "I am Groot!";

  public Groot() {
  }

  public Groot(String received) {
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
