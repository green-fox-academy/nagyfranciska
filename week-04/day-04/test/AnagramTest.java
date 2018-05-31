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
  public void should_tell_if_StringsLength_is_different() {
    String asd = "asd";
    String asdf = "asdf";

    assertFalse(testAnagram.anagram(asd, asdf));
  }

  @Test
  public void should_tell_if_Strings_Are_Anagrams () {
    String abc = "abca";
    String acb = "acba";

    assertTrue(testAnagram.anagram(abc, acb));
  }

  @Test
  public void should_tell_if_Strings_Are_Anagrams_if_Different_CharacterCase () {
    String abc = "aBc";
    String acb = "acb";

    assertTrue(testAnagram.anagram(abc, acb));
  }

  @Test
  public void should_tell_if_there_is_spaceCharacter() {
    String abc = "abc";
    String acb = "ac   b";

    assertFalse(testAnagram.anagram(abc, acb));
  }

  @Test
  public void should_tell_if_Strings_hasSameLength_and_SameCharacters_but_NOT_Anagrams () {
    String abc = "abcc";
    String acb = "acba";

    assertFalse(testAnagram.anagram(abc, acb));
  }
}