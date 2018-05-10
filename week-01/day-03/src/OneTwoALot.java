import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a number to work with!");
        int userInput = scan.nextInt();

        if (userInput <= 0) {
            System.out.println("Not enough");
        }   else if (userInput == 1) {
            System.out.println("One");
        }   else if (userInput == 2) {
            System.out.println("Two");
        }   else {
            System.out.println("A lot");
        }







    }
}
