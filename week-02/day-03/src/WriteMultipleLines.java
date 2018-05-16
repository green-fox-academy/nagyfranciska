import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Give me a path and file name: ");
    String location = scan.nextLine();

    System.out.println("Give me a word: ");
    String word = scan.nextLine();

    System.out.println("Give me a number: ");
    int number = scan.nextInt();

    System.out.println(MultipleLines(location,word,number));
  }

  public static String MultipleLines (String location,String word, Integer number) {
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
