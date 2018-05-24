public class Counter {
  public static void main(String[] args) {

  // Write a recursive function that takes
  // one parameter: n and counts down from n.

  int number = 10;
    System.out.println(counter(number));

  }

  private static int counter(int n) {
    if (n == 1) {
    return n;
    } else {
      return counter(n-1);
    }
  }
}
