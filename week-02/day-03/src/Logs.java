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
    System.out.println(GetPostRatio(data));

  }

  public static List<String> IPAddress(String data) {
    Path path = Paths.get(data);
    List<String> IPs = new ArrayList<>();
    try {
      List<String> log = Files.readAllLines(path);
      for (int i = 0; i < log.size(); i++) {
      IPs.add(log.get(i).split(" ")[8]);
      }
    } catch (IOException e) {
      System.out.println("File not found.");
    }
    return IPs;
  }

  public static double GetPostRatio(String data) {
    Path path = Paths.get(data);
    List<String> getAndPost = new ArrayList<>();
    int get = 0;
    int post = 0;
    try {
      List<String> log = Files.readAllLines(path);
      for (int i = 0; i < log.size(); i++) {
        getAndPost.add(log.get(i).split(" ")[11]);
      }
      for (String pOrG : getAndPost) {
        if (pOrG.equals("POST")) {
          post += 1;
        } else {
          get += 1;
        }
      }
    } catch (IOException e) {
      System.out.println("File not found.");
    }
    return (double) get/post;
  }
}
