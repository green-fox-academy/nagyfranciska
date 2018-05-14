import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {

    int[] aj = new int[] {3,4,5,6,7};

    if (aj.length % 2 == 0) {
      for (int i = 0; i < aj.length/2; i++) {
        int temporal = aj[i];
        aj[i] = aj[aj.length - i - 1];
        aj[aj.length -i -1] = temporal;
      }
      System.out.println(Arrays.toString(aj));
    }else {
      for (int i = 0; i < (aj.length+1)/2; i++) {
        int temporal = aj[i];
        aj[i] = aj[aj.length - i - 1];
        aj[aj.length -i -1] = temporal;
      }
      System.out.println(Arrays.toString(aj));
    }
      // if loop in case the number of array's items can change from odd or even

  }
}




 // for (int i = 0; i < aj.length; i++) {
 // int temporal = aj[i];
 // aj[i] = aj[aj.length - i - 1];
 // aj[aj.length -i -1] = temporal;
 // System.out.println(Arrays.toString(aj));
 // }