public class Greet {
  public static void main(String[] args) {

    // - Create a string variable named `al` and assign the value `Greenfox` to it
    // - Create a function called `greet` that greets it's input parameter
    // - Greeting is printing e.g. `Greetings dear, Greenfox`
    // - Greet `al`

    String a1 = "Greenfox";
    System.out.println(greet(a1));

  }

    public static String greet(String userGreeting) {
    return "Greetings dear, " + userGreeting;

  }
}