import java.util.ArrayList;
import java.util.Arrays;

public class exercise06 {

//  Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
//  ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    cities.stream()
      .filter(city -> city.startsWith("A") && city.endsWith("I"))
      .forEach(System.out::print);

  }
}
