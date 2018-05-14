import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {

    String[] abc = new String[] {"first","second","third"};

    String temperal = abc[0];
    abc[0] = abc[2];
    abc[2] = temperal;
    System.out.println(Arrays.toString(abc));

    // more handy way to swap first and last elements:

    // String temperal = abc[0];
    // abc[0] = abc[abc.length -1];
    // abc[abc.length -1] = temperal;
    // System.out.println(Arrays.toString(abc));
  }
}