import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me two numbers, the first represents the girls, the second the boys: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if (number1 == number2 && (number1 + number2) > 20) {
            System.out.println("The party is excellent!");
        } else if (number1 != number2 && (number1 + number2) > 20) {
            System.out.println("Quite cool party!");
        } else if ((number1 + number2) < 20) {
            System.out.println("Average party...");
        } else {
            System.out.println("Sausage party");
        }

    }
}
