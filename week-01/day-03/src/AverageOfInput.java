import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        // int a = 0;
        // for (int i = 0; i < 5 ; i++) {
        //      Scanner askForNumber = new Scanner(System.in);
        //      System.out.println("Please give me a number: ");
        //      int userInput = askForNumber.nextInt();

        //    }    ... but how to make it save the inputs on different ints?...
        //              and count up the askForNumbers too?

        Scanner number = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int userInput1 = number.nextInt();

        Scanner askForNumber2 = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int userInput2 = askForNumber2.nextInt();

        Scanner askForNumber3 = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int userInput3 = askForNumber3.nextInt();

        Scanner askForNumber4 = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int userInput4 = askForNumber4.nextInt();

        Scanner askForNumber5 = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int userInput5 = askForNumber5.nextInt();

        int inputSum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;

        System.out.println("Sum: " + inputSum);
        System.out.println("Average: " + inputSum / 5.);





    }
}
