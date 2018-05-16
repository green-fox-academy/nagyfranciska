import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {

    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("assets/win-o.txt"));
    System.out.println(ticTacResult("assets/win-x.txt"));
    System.out.println(ticTacResult("assets/draw.txt"));
  }
  public static String ticTacResult (String fileName) {
    Path path = Paths.get(fileName);
    List<String> content = null;
    try {
      content = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("File not found.");
    } return content.toString();
  }
}
