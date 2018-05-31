public class Anagram {

  public static boolean anagram(String stringOne, String stringTwo) {
    return (haveSameLength(stringOne, stringTwo) && haveSameCharacterSet(stringOne, stringTwo));
  }

  public static boolean haveSameLength(String stringOne, String stringTwo) {

    // or
    // stringOne.trim();
    // stringTwo.trim();
    // and no need for if, only return (stringOne.length() == stringTwo.length());

    if (stringOne.contains(" ") && !stringTwo.contains(" ")) {
      return false;
    } else {
      return (stringOne.length() == stringTwo.length());
    }
  }

  public static boolean haveSameCharacterSet(String stringOne, String stringTwo) {

    //  stringOne.toLowerCase();
    //  stringTwo.toLowerCase();

    char firsStringChar = ' ';
    char secondStringChar = ' ';

    for (int i = 0; i < stringOne.length(); i++) {
      for (int j = 0; j < stringTwo.length(); j++) {
        if (stringOne.charAt(i) == stringTwo.charAt(j)) {


        return true;
        }
      }
    }
    return false;
  }
}
