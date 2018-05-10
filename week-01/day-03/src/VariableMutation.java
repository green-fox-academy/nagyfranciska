public class VariableMutation {

    public static void main(String[] args) {

        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean compar = (f1 > f2);

        if (compar) {
            System.out.println("f1 is bigger than f2.");
        }   else {
            System.out.println("f1 is not bigger than f2.");
        }

        int g1 = 350;
        int g2 = 200;
        boolean comparDouble = (g2 * 2 > g1);

        if (comparDouble) {
            System.out.println("The double of g2 is bigger than g1.");
        }   else {
            System.out.println("The double of g2 is NOT bigger than g1.\"");
        }

        int h = 135798745;
        boolean divNumber = (h % 11 == 0);

        if (divNumber) {
            System.out.println("Number 11 is a divisor.");
        }   else {
            System.out.println("Number 11 is NOT a divisor.");
        }

        int i1 = 10;
        int i2 = 3;
        boolean squareNumber = (i1 > Math.pow(i2,2));
        boolean cubeNumber = (i1 < Math.pow(i2,3));

        if (squareNumber && cubeNumber) {
            System.out.println("i1 is higher than i2 squared and smaller than i2 cubed.");
        }   else {
            System.out.println("i1 is NOT higher than i2 squared and NOT smaller than i2 cubed");
        }

        int j = 1521;
        boolean threeAsDiv = (j % 3 == 0);
        boolean fiveAsDiv = (j % 5 == 0);

        if (threeAsDiv || fiveAsDiv) {
            System.out.println("j is dividable by 3 or 5.");
        }   else {
            System.out.println("j is NOT dividable by 3 or 5");
        }
        
        String k = "Apple";
        int samp = 1;

        while (samp < 5) {
            System.out.println(k);
            samp += 1;
        }
















    }
}
