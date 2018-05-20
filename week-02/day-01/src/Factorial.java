public class Factorial {
  public static void main(String[] args) {

    // - Create a function called `factorio` that returns it's input's factorial

    int num = 5;
    System.out.println(num + "! = " + Factorio(num));

  }

  public static int Factorio(int number) {
    int factorial = 1;
    for (int i = 1; i < number + 1; i++) {
      factorial *= i;
    } return factorial;
  }
}
