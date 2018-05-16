import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {

    // Create a function that takes a number divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    try {
      int result = 10/divideFunction(userInput);
      System.out.println(result);
    } catch(Exception e) {
      System.out.println("fail");
    }

  }

  public static int divideFunction(int randomNumber) {
    return randomNumber;
  }
}
