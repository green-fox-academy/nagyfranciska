import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner distanceInKm = new Scanner(System.in);
        System.out.println("Please give me the distance in km!");
        int userInput = distanceInKm.nextInt();

        double convNumber = userInput * 0.621371;

        System.out.println(convNumber);


    }
}
