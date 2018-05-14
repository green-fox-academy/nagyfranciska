public class Greet {
  public static void main(String[] args) {

    String a1 = "Greenfox";
    System.out.println(greet(a1));
  }
    public static String greet(String userGreeting) {
      return "Greetings dear, " + userGreeting;
    }
}