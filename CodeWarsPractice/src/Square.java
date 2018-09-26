public class Square {
    public static void main(String[] args) {

//  Check if your number of building blocks is a perfect square

        System.out.println(isSquare(16));
    }
    public static boolean isSquare(int n) {
        double squareNumber = Math.sqrt(n);
        if (n % squareNumber == 0 || n == 0) {
            return true;
        }   else {
            return false;
        }
    }
}
