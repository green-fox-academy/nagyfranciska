public class SumDigit {
  public static void main(String[] args) {

    // Given a non-negative int n, return the sum of
    // its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost
    // digit (126 % 10 is 6), while divide (/) by 10
    // removes the rightmost digit (126 / 10 is 12).

    int number = 1832;
    System.out.println(digitSum(number));

  }

  private static int digitSum(int n) {
    int sum = 0;
    if (n < 10) {
      return n;
    } else {
      sum += n % 10;
      return  sum + digitSum( (n - (n % 10)) / 10);
    }
  }
}
