import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {

    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter path and file name: ");
    String location = scan.nextLine();

    System.out.println("Give me a word: ");
    String word = scan.nextLine();

    System.out.println("Give me a number: ");
    int number = scan.nextInt();

    System.out.println(MultipleLines(location,word,number));
  }

  public static String MultipleLines (String location, String word, int number) {
    List<String> content = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      content.add(word);
      }

    Path path = Paths.get(location);
    try {
      Files.write(path,content);
      return "file is written!";
    } catch (IOException e) {
      return "0";
    }
  }
}
