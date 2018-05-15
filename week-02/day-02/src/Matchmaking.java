import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
  public static void main(String[] args) {

    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    System.out.println(makingMatches(girls, boys));

  }
  public static ArrayList makingMatches(ArrayList list1, ArrayList list2) {

    ArrayList<String> newList = new ArrayList<>();
    for (int i = 0; i < list1.size() ; i++) {
      newList.add(list1.get(i).toString());
      newList.add(list2.get(i).toString());
    }
    return newList;
  }

}
