import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {

    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    if (num1 > num2) {
      System.out.println("The second number should be bigger");
    } else {
      for (int i = num1; i < num2; i++) {
        System.out.println(num1);
        num1 += 1;
      }
    }

  }
}
