import java.util.Arrays;

public class AppendA {
  public static void main(String[] args) {

    // - Create an array variable named `animals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end

    String[] animals = new String[] {"kuty", "macsk", "cic"};

    for (int i = 0; i < animals.length; i++) {
      animals[i] += "a";
    }
    System.out.println(Arrays.toString(animals));

  }
}