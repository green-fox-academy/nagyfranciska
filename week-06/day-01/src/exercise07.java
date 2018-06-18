import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class exercise07 {

//  Write a Stream Expression to find the frequency of characters in a given string!

  public static void main(String[] args) {

    String example = "TTThree";


    Map<Character, Integer> frequency = example.chars()
      .mapToObj(s -> (char)s)
      .collect(Collectors.toConcurrentMap(key -> key, val -> 1, Integer::sum));

    System.out.println(frequency);

    //  or

    Map<String, Integer> frequency2 = example.chars()
      .boxed()
      .collect(Collectors.toMap(key -> String.valueOf((char)key.intValue()), val -> 1, Integer::sum));

    frequency2.forEach(((key, val) -> System.out.print(key + ":" + val + "\n")));

    //  or

    Map<Character, Long> frequency3 = example.chars()
      .mapToObj(s -> (char)s)
      .collect(Collectors.groupingBy(key -> key, Collectors.counting()));

    frequency3.forEach((key, val) -> System.out.println(key + " : " + val));

  }
}
