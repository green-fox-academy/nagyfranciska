import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class exercise08 {


//  Write a Stream Expression to find the frequency of numbers in the following array:
//  ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Integer> frequency = numbers.stream()
      .collect(Collectors.toConcurrentMap(key -> key, val -> 1, Integer::sum));

    frequency.forEach((key, val) -> System.out.println(key + ":" + val));

  }
}
