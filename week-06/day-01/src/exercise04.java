import java.util.ArrayList;
import java.util.Arrays;

public class exercise04 {

//  Write a Stream Expression to find which number squared value is more then 20 from the following array:
//  ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
   numbers.stream()
     .filter(n -> n * n > 20);

  }
}
