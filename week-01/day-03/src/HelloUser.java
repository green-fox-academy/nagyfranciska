import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please give me your name!");
        String userName = userInput.nextLine();

        System.out.println("Hello, " + userName + "!");

    }
}
