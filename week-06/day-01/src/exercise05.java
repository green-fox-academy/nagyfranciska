public class exercise05 {

//  Write a Stream Expression to find the uppercase characters in a string!

  public static void main(String[] args) {
    String example = "ORganIcalGenmanIpulatioN";

    example.chars()
      .mapToObj(s -> (char)s)
      .filter(s -> s.isUpperCase(s))
      //  or
      //.filter(Character::isUpperCase)
      .forEach(System.out::print);

  }
}
