public class VariableMutation {
  public static void main(String[] args) {

    int a = 3;  // make it bigger by 10
    a += 10;
    System.out.println(a);

    int b = 100;  // make it smaller by 7
    b -= 7;
    System.out.println(b);

    int c = 44; // please double c's value
    c *= 2;
    System.out.println(c);

    int d = 125;  // please divide by 5 d's value
    d /= 5;
    System.out.println(d);

    int e = 8;  // please cube of e's value
    e *= e * e;
    System.out.println(e);

    int f1 = 123;   // tell if f1 is bigger than f2 (print as a boolean)
    int f2 = 345;
    boolean isBigger = (f1 > f2);
    if (isBigger) {
      System.out.println("f1 is bigger than f2.");
    } else {
      System.out.println("f1 is not bigger than f2.");
    }

    int g1 = 350;   // tell if the double of g2 is bigger than g1 (print as a boolean)
    int g2 = 200;
    boolean compareDouble = (g2 * 2 > g1);
    if (compareDouble) {
      System.out.println("The double of g2 is bigger than g1.");
    } else {
      System.out.println("The double of g2 is NOT bigger than g1.");
    }

    int h = 135798745;  // tell if it has 11 as a divisor (print as a boolean)
    boolean divNumber = (h % 11 == 0);
    if (divNumber) {
      System.out.println("Number 11 is a divisor.");
    } else {
      System.out.println("Number 11 is NOT a divisor.");
    }

    int i1 = 10;  // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    int i2 = 3;
    boolean squareNumber = (i1 > Math.pow(i2,2));
    boolean cubeNumber = (i1 < Math.pow(i2,3));
    if (squareNumber && cubeNumber) {
      System.out.println("i1 is higher than i2 squared and smaller than i2 cubed.");
    } else {
      System.out.println("i1 is NOT higher than i2 squared and/or NOT smaller than i2 cubed");
    }

    int j = 1521;   // tell if j is dividable by 3 or 5 (print as a boolean)
    boolean threeAsDiv = (j % 3 == 0);
    boolean fiveAsDiv = (j % 5 == 0);
    if (threeAsDiv || fiveAsDiv) {
      System.out.println("j is dividable by 3 or 5.");
    } else {
      System.out.println("j is NOT dividable by 3 nor 5.");
    }
        
    String k = "Apple";   //fill the k variable with its content 4 times
    for (int i = 0; i < 2 ; i++) {
      k += k;
    }
    System.out.println(k);

  }
}
