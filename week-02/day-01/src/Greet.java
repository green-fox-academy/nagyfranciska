import java.util.Scanner;

public class Greet {
  public static void main(String[] args) {

    // - Create a string variable named `al` and assign the value `Greenfox` to it
    // - Create a function called `greet` that greets it's input parameter
    // - Greeting is printing e.g. `Greetings dear, Greenfox`
    // - Greet `al`

    String a1 = "Szia Zsuzsa! :D";
    System.out.println(greet(a1));
    askZsuzsa();

  }

    public static String greet(String userGreeting) {
    return userGreeting + "This is me, the Ghost in the Shell, so the program. \n Are you planning to renovate your home?";
  }

    public static void askZsuzsa() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Yes or No? Please give me an answer!");

      String answer = sc.nextLine();

      if (answer.equals("Yes") || answer.equals("yes") ) {
        System.out.println("Cool, I am sure it will be beautiful! :)");
      }
      else if (answer.equals("No") || answer.equals("no")) {
        System.out.println("Oh, sorry then, I thought it bc of your drawing...");
      }
      else {
        System.out.println("Sorry, I did not understand, try it again!");
        askZsuzsa();
      }
    }
}