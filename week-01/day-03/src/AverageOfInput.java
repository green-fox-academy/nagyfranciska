import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        float a = 5;
        int userInput = 0;

        for (int i = 0; i < a; i++) {
            Scanner askForNumber = new Scanner(System.in);
            System.out.println("Please give me a number: ");
            userInput += askForNumber.nextInt();
        }

        System.out.println("Sum: " + userInput);
        System.out.println("Average: " + userInput / a);


    }
}
