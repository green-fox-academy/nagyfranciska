public class String1 {
  public static void main(String[] args) {

    // Given a string, compute recursively (no loops) a new string
    // where all the lowercase 'x' chars have been changed to 'y' chars.

    String text = "xXxX";
    System.out.println(changeString(text));

  }

  private static String changeString(String string) {
      if (string.contains("x")) {
        string = string.replace('x', 'y');
        return changeString(string);
      } else {
        return string;
      }
  }
}

