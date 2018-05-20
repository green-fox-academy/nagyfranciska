import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {

    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int userInput = scan.nextInt();
    String pattern = "*";
    String emptyP = " ";
    int num = userInput;

    for (int i = 0; i < userInput; i++) {
      for (int j = num - 1; j > 0; j--) {
        System.out.print(emptyP);
      }
      System.out.println(pattern);
      pattern += "**";
      num -= 1;
    }

  }
}
