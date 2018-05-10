import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Give me a number, please!");
        int userNumber1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Give me another, too!");
        int userNumber2 = scan2.nextInt();

        if (userNumber1 < userNumber2) {
            System.out.println(userNumber2);
        }   else {
            System.out.println(userNumber1);
        }

    }
}
