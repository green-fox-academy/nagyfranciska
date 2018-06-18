import java.util.Arrays;

public class exercise09 {

//  Write a Stream Expression to convert a char array to a string!

  public static void main(String[] args) {

    Character[] characterArray = new Character[] {'W', 'e', 'l', 'c', 'o', 'm' , 'e', ' ', 't', 'o', ' ', 't', 'h', 'e', ' ', 'J', 'u', 'n', 'g', 'l', 'e'};
    System.out.println(convertCharArrayToString(characterArray));

  }

  private static String convertCharArrayToString(Character[] example) {
    return Arrays.stream(example)
      .map(c -> Character.toString(c))
      .reduce((word, character) -> word + character)
      .get();

  }
}
