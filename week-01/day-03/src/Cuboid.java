public class Cuboid {
  public static void main(String[] args) {

    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    double length = 15;
    double height = 10;
    double width = 8;

    double surfaceArea = 2 * (length * height + length * width + height * width);
    double volume = length * height * width;

    System.out.println("Surface Area: " + surfaceArea);
    System.out.println("Volume: " + volume);

  }
}
