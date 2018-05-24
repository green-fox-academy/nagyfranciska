public class String2 {
  public static void main(String[] args) {

    // Given a string, compute recursively a new string
    // where all the 'x' chars have been removed.

    String text = "xXBxXB";
    System.out.println(removeChar(text));


  }

  private static String removeChar(String string) {
    if (string.contains("x")) {
      string = string.replace("x", "");
      return removeChar(string);
    } else {
      return string;
    }

  }
}
