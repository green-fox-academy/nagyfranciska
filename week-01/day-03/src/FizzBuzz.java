public class FizzBuzz {

    public static void main(String[] args) {

        int number = 1;
        String fizz = "Fizz";
        String buzz = "Buzz";

        for (int i = 0; i < 100; i++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(fizz + buzz);
            }   else if (number % 3 == 0) {
                System.out.println(fizz);
            }   else if (number % 5 == 0) {
                System.out.println(buzz);
            }   else {
                System.out.println(number);
            }
            number += 1;
        }




    }

}
