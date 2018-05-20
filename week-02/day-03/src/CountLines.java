import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) throws IOException {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    String file = "SummerTime.txt";
    int numberOfLines = lineCounter(file);
    System.out.println(numberOfLines);

  }

  public static int lineCounter (String fileName) {

    Path path = Paths.get(fileName);
    List<String> lines = null;
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      return 0;
    }
    return lines.size();
  }
}
