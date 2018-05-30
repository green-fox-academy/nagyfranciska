public class Gnirts implements CharSequence {
  private String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.substring(start, end);
  }

  public static void main(String[] args) {
    Gnirts gnirts = new Gnirts("fuckOff");

    System.out.println(gnirts.length());
    System.out.println(gnirts.charAt(5));
    System.out.println(gnirts.subSequence(4, gnirts.length()));

  }
}
