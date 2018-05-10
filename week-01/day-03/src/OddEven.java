import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int userNumber = userInput.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("Even number.");
        }   else {
            System.out.println("Odd number.");
        }




    }
}
