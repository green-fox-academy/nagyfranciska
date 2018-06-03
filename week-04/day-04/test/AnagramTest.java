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

  @Test
  public void differentLength() {
    String asd = "asd";
    String asdf = "asdf";
    assertFalse(testAnagram.anagram(asd, asdf));
  }
  @Test
  public void different_CharacterCase () {
    String abc = "aBc";
    String acb = "acb";
    assertFalse(testAnagram.anagram(abc, acb));
  }
  @Test
  public void spaceCharacter() {
    String abc = "abc";
    String acb = "ac   b";
    assertFalse(testAnagram.anagram(abc, acb));
  }
  @Test
  public void SameLengthSameCharacters_but_NOT_Anagrams () {
    String abc = "abcc";
    String acb = "acba";
    assertFalse(testAnagram.anagram(abc, acb));
  }
}