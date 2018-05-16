import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {

    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String fileName1 = "./assets/new-file.txt";
    String fileName2 = "./assets/sample.txt";

    System.out.println(CopyFunction(fileName1,fileName2));
  }

  public static boolean CopyFunction(String file1, String file2) {
    boolean isSuccessful = false;
    Path pathF1 = Paths.get(file1);
    List<String> content1 = null;
    try {
      content1 = Files.readAllLines(pathF1);
    } catch (IOException e) {
      System.out.println("Copy file is not found.");
    }
    Path pathF2 = Paths.get(file2);
    try {
      Files.write(pathF2,content1);
      isSuccessful = true;
    } catch (IOException e) {
      System.out.println("Target file is not found.");
    }
    return isSuccessful;
  }
}

