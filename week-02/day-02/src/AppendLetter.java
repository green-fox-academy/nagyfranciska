import java.util.Arrays;
import java.util.List;

public class AppendLetter {
  public static void main(String[] args) {

    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
    System.out.println(appendA(far));
  }

  public static List appendA(List list) {
    String animal = "";
    for (int i = 0; i < list.size(); i++) {
    animal = list.get(i).toString();
    animal += "a";
    list.set(i, animal);
   }
    return list;
  }
}
