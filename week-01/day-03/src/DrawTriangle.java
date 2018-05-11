import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number:");
        int userInput = scan.nextInt();

        String pattern = "*";

        for (int raw = 0; raw < userInput; raw++) {

            System.out.println(pattern);
            pattern += "*";
        }









    }
}
