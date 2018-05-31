import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {

  static Anagram testAnagram;

  @BeforeClass
  public static void init() {
    testAnagram = new Anagram();
  }

  @Test
  public void isAnagram() {
    String abc = "abc";
    String acb = "acb";

    assertTrue(testAnagram.anagram(abc, acb));
  }
}