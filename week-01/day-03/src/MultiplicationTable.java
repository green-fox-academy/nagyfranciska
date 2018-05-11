import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int userInput = scan.nextInt();

        int multip = 10;

        for (int i = 1; i < (multip + 1); i++) {
            System.out.println(i + " * " + userInput + " = " + i * userInput);

        }


        








    }
}
