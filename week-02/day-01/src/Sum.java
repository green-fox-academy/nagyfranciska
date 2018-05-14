import java.util.Arrays;

public class Sum {
  public static void main(String[] args) {

    int[] listOfNum = new int[] {2,5,7};
    System.out.println(sum(listOfNum));

  }

  public static int sum(int[] numbers) {
    int summa = 0;
    for (int i = 0; i < numbers.length; i++) {
      summa += numbers[i];
    }
    return summa;
  }

}
