import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;
  static ArrayList<Integer> listOfNumbers;

  @BeforeClass
  public static void init() {
    sum = new Sum();
    listOfNumbers = new ArrayList<Integer>();
  }

  @Test
  public static int should_SumArrayList(ArrayList<Integer>) {
    int summa = 0;
    return summa;
  }

}