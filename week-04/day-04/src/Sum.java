import java.util.ArrayList;

public class Sum {

  public static int sum(ArrayList<Integer> listOfNumbers) {
    int sumOfNumbers = 0;
    if (listOfNumbers == null) {
      return sumOfNumbers;
    } else {
      for (int number : listOfNumbers) {
        sumOfNumbers += number;
      }
    }
    return sumOfNumbers;
  }
}
