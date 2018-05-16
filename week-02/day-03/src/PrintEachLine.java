import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) throws IOException {

    // Write a program that opens a file called
    // "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file
    // (for example it does not exists),
    // then it should print an error message like:
    // "Unable to read file: my-file.txt"

    try {
      String text = "my-file.txt";
      Path path = Paths.get(text);
      List<String> lines = Files.readAllLines(path);
      System.out.println(lines);
    } catch(IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
