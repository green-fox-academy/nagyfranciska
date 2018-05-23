public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    inkAmount = 100;
    this.color = color;
    this.width = width;
  }

  public void use() {
    inkAmount -= 1;
  }
}
