import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        Scanner chicken = new Scanner(System.in);
        System.out.println("How many chickens do the farmer have? Give me a number!");
        int userChicken = chicken.nextInt();

        Scanner pig = new Scanner(System.in);
        System.out.println("Great! And how many pigs does he have?");
        int userPig = pig.nextInt();

        System.out.println("All those animals have " + (userChicken * 2 + userPig * 4) + " legs. Wow!");



    }
}
