import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

//  Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
//  it's up to you how you name/create them! Write a Stream Expression to find the foxes
//  with green color! Write a Stream Expression to find the foxes with green color and pallida type!

  private String name;
  private String type;
  private String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }

  public static void main(String[] args) {

    Fox fox1 = new Fox("Vuk", "red fox", "green");
    Fox fox2 = new Fox("Kag", "arctic", "white");
    Fox fox3 = new Fox("Karak", "fennec", "red");
    Fox fox4 = new Fox("Seth", "bengal", "yellow");
    Fox fox5 = new Fox("Horatio", "pallida", "green");

    List<Fox> foxes = new ArrayList<>();

    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);

    System.out.println("Green colored fox(es): " + getGreenFoxes(foxes));
    System.out.println("Green colored pallida fox(es): " + getGreenAndPallidaFoxes(foxes));
  }

  public static String getGreenFoxes(List<Fox> listOfFoxes) {
    return listOfFoxes.stream()
      .filter(fox -> fox.getColor().equals("green"))
      .map(fox -> fox.getName())
      .collect(Collectors.joining(", "));
  }

  public static String getGreenAndPallidaFoxes(List<Fox> listOfFoxes) {
    return listOfFoxes.stream()
      .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("pallida"))
      .map(fox -> fox.getName())
      .collect(Collectors.joining(", "));
  }
}
