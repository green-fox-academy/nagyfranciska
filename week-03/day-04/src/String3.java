public class String3 {
  public static void main(String[] args) {

    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".

    String text = "asdf";
    System.out.println(separate(text));

  }

  private static String separate(String string) {
    String newString = "";
    if (string.length() == 1) {
      newString = newString.concat(string.charAt(0) + "*");
      return newString;
      } else {
        newString = newString.concat(string.charAt(0) + "*");
        string = string.substring(1);
        return newString + separate(string);
    }
  }
}
