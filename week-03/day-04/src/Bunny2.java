public class Bunny2 {
  public static void main(String[] args) {

    // We have bunnies standing in a line, numbered 1, 2, ...
    // The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because
    // they each have a raised foot. Recursively return the number
    // of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    int bunniesEven = 2;
    int bunniesOdd = 3;
    System.out.println(earCounter(bunniesEven));
    System.out.println(earCounter(bunniesOdd));
  }

  private static int earCounter(int number) {
    int earsOfOdd = 2;
    int earsOfEven = 3;
    int sum = 0;
    if (number == 1) {
      return sum + earsOfOdd;
    } else if (number % 2 == 0) {
      sum += earsOfEven;
      return sum + earCounter(number - 1);
    } else {
      sum += earsOfOdd;
      return sum + earCounter(number - 1);
    }
  }

}
