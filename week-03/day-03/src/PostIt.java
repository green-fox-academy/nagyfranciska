public class PostIt {

  String backgroundColor;
  String text;
  String textColor;

  public void PostIt() {
    this.backgroundColor = null;
    this.text = null;
    this.textColor = null;

  }

  public void postIt (String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;

  }
}
