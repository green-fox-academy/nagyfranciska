public class Sum {
  public static void main(String[] args) {

    // - Write a function called `sum` that sums all the numbers
    //   until the given parameter and returns with an integer

    int[] listOfNumbers = new int[] {2,5,7};
    System.out.println(sum(listOfNumbers));

  }
  public static int sum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
