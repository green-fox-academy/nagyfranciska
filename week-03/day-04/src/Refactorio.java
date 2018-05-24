public class Refactorio {
  public static void main(String[] args) {

    // Create a recursive function called `refactorio`
    // that returns it's input's factorial

    int number = 5;
    System.out.println(number + "! = " + refactorio(number));

  }

  private static int refactorio(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * refactorio(n - 1);
    }
  }
}
