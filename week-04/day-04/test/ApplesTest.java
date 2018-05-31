import org.junit.BeforeClass;
import org.junit.Test;
import sun.plugin2.message.GetAppletMessage;

import static org.junit.Assert.*;

public class ApplesTest {

  static Apples apples;

  @BeforeClass
  public static void init() {
    apples = new Apples();
  }

  @Test
  public void should_returnApple() {

    String expected = "apple";
    String result = apples.getApple();
    assertEquals(expected, result);
  }


}