import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number:");
        int userInput = scan.nextInt();

        String pattern = "*";
        String emptyP = " ";
        int num = userInput;

        for (int r = 0; r < userInput; r++) {

            for (int c = 0; c < num - 1; c++) {
                System.out.print(emptyP);
            }
            System.out.println(pattern);
            pattern += "**";
            num -= 1;

        }


    }
}
