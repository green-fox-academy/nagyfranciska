import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class exercise07 {

//  Write a Stream Expression to find the frequency of characters in a given string!

  public static void main(String[] args) {

    String example = "TTThree";

    Map<Character, Integer> frequency = example.chars()
      .mapToObj(s -> (char)s)
      .collect(Collectors.toConcurrentMap(c -> c, c -> 1, Integer::sum));

    System.out.println(frequency);

    //  or

    Map<Character, Long> frequency2 = example.chars()
      .mapToObj(s -> (char)s)
      .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    frequency2.forEach((ch, val) -> System.out.println(ch + " : " + val));

    //  or



  }
}
