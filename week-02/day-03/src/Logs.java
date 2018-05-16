import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {

    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.

    String data = "assets/log.txt";
    System.out.println(IPAddress(data));

  }
  public static String IPAddress(String data) {
    Path path = Paths.get(data);
    List<String> dataLine = new ArrayList<>();
    List<String> IPs = new ArrayList<>();
    try {
      dataLine = Files.readAllLines(path);
      System.out.println(dataLine.size());

      for (int i = 0; i < dataLine.size(); i++) {
      IPs.add(dataLine.get(i).split(" ")[8]);
      }
    } catch (IOException e) {
      System.out.println("File not found.");
    }
    return IPs.toString();
  }

}
