import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
  public static void main(String[] args) {

    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has
    // list parameter and returns the correct list.

    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
    System.out.println(putSaturn(planetList));

  }

  public static ArrayList putSaturn(ArrayList planet) {
    planet.add(5, "Saturn");
    return planet;

  }
}

