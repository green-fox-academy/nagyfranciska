import java.util.Arrays;

public class AppendA {
  public static void main(String[] args) {

    String[] animals = new String[] {"kuty", "macsk", "cic"};

    for (int i = 0; i < animals.length; i++) {
      animals[i] = animals[i] + "a";

    }

    System.out.println(Arrays.toString(animals));

  }

}