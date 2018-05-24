public class NumberAdder {
  public static void main(String[] args) {

    // Write a recursive function that takes
    // one parameter: n and adds numbers from 1 to n.

    int number = 12;
    System.out.println(adder(number));
  }

  private static int adder(int n) {
    if (n == 1) {
      return n;
    } else {
      return n + adder(n-1);
    }
  }
}
