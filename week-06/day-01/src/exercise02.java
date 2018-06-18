import java.util.ArrayList;
import java.util.Arrays;

public class exercise02 {

//  Write a Stream Expression to get the average value of the odd numbers from the following array:
//  ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    numbers.stream()
      .filter(n -> n % 2 == 1)
      .mapToInt(n -> n)
      .average();

  }
}
