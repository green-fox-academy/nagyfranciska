import java.util.Arrays;

public class Anagram {

  public boolean anagram(String stringOne, String stringTwo) {
    char[] first = stringOne.toCharArray();
    char[] second = stringTwo.toCharArray();

    Arrays.sort(first);
    Arrays.sort(second);

    boolean anagram = Arrays.equals(first, second);

    return anagram;
  }
}
