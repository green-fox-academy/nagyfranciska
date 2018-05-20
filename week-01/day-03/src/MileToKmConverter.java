import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {

    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    Scanner distanceInKm = new Scanner(System.in);
    System.out.println("Enter the distance in km: ");
    double userInput = distanceInKm.nextInt();

    double distanceInMiles = userInput * 0.621371;
    System.out.println(distanceInMiles);

  }
}
