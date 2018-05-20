public class PrintParams {
  public static void main(String[] args) {

    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourth")

    printParams("one ", "two ");
    printParams("one ", "two ", "three ", "forth ");
  }

  public static void printParams(String... count) {
    String string = "";
    for (String str : count) {
      string += str;
    }
    System.out.println(string);
 }
}

