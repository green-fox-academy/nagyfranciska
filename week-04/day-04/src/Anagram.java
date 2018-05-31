public class Anagram {

  public static boolean anagram(String stringOne, String stringTwo) {
    boolean isAnagram = false;
    if (haveSameLength(stringOne, stringTwo)) {
      for (int i = 0; i < stringOne.length(); i++) {
        for (int j = 0; j < stringTwo.length(); j++) {
          if (stringOne.charAt(i) == stringTwo.charAt(j)) {
            isAnagram = true;
          }
        }
      }
    }
    return isAnagram;
  }

  public static boolean haveSameLength(String stringOne, String stringTwo) {
    boolean sameLength = false;
    if (stringOne.length() == stringTwo.length()) {
      sameLength = true;
    }
    return sameLength;
  }

}
