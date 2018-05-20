import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {

    // Write a program that reads a number from
    // the standard input, then draws a triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int userInput = scan.nextInt();
    String pattern = "*";

    for (int i = 0; i < userInput; i++) {
      System.out.println(pattern);
      pattern += "*";
    }

  }
}
