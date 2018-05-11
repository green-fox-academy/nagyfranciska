import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 >= num2) {
            System.out.println("The second number should be bigger");
        }   else {

        //    num1 += 1;
        //    System.out.println(num1);

            for (int i = 0; i < num2 - 2; i++) {
                System.out.println(num1);
                num1 +=1;
            }
        }




    }
}
