public class Bunny1 {
  public static void main(String[] args) {

    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies
    // recursively (without loops or multiplication).

    int bunnies = 7;
    System.out.println(countEars(bunnies));

  }

  private static int countEars(int number) {
    int ears = 2;
    int sum = 0;
    if (number == 1) {
      sum += ears;
      return sum;
    } else {
      sum += ears;
      return sum + countEars(number - 1);
    }
  }
}
