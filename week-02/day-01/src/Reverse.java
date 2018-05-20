import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {

    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    int[] aj = new int[] {3, 4, 5, 6, 7};
    int[] temporal = new int[5];

    for (int i = 0; i < aj.length; i++) {
      temporal[i] = aj[aj.length - 1] - i;
    }
    for (int i = 0; i < temporal.length; i++) {
      aj[i] = temporal[temporal.length - 1] - i;
    }
    System.out.println(Arrays.toString(temporal));

  }
}
