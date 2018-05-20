import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 5 numbers: ");
    int userInput = 0;

    for (int i = 0; i < 5; i++) {
      userInput += scanner.nextInt();
    }
    System.out.println("Sum: " + userInput);
    System.out.println("Average: " + userInput/5.);

  }
}
