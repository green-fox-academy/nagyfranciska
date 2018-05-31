import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class SumTest {

  static Sum sumTest;
  static ArrayList<Integer> testList;

  @Before
  public void init() {
    sumTest = new Sum();
    testList = new ArrayList<Integer>();
  }

  @Test
  public void should_SumArrayList() {
    int randomNumber1 = 2;
    int randomNumber2 = 5;
    int randomNumber3 = 7;
    testList.add(randomNumber1);
    testList.add(randomNumber2);
    testList.add(randomNumber3);

    int expected = randomNumber1 + randomNumber2 + randomNumber3;

    assertEquals(expected, sumTest.sum(testList));
  }

  @Test
  public void should_returnZero_whenEmptyArrayList() {
    assertEquals(0, sumTest.sum(testList));
  }

}