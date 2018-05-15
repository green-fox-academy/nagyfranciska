import java.util.Arrays;
import java.util.List;

public class AppendLetter {
  public static void main(String[] args) {

    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
    System.out.println(appendA(far));
  }

  public static List appendA(List addChar) {
    String animal = "";
    for (int i = 0; i < addChar.size(); i++) {
      animal = addChar.get(i).toString();
      animal += "a";
      addChar.set(i,(Object)animal);
    }
    return addChar;
  }
}
