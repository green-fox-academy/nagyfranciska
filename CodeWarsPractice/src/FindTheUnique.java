import java.util.Arrays;

public class FindTheUnique {
    public static void main(String[] args) {
//        UNFINISHED, works but fails on CodeWars
//        Find the unique number in an array

        double[] a1 = new double[]{ 1, 1, 1, 2, 1, 1 };
        double[] a2 = new double[]{ 0, 0, 0.55, 0, 0 };
        double[] a3 = new double[]{ 0, 0, 0, 0, 0.1 };
        double[] a4 = new double[]{ 0.7, 0, 0, 0, 0 };

        System.out.println(findUnique(a1));
        System.out.println(findUnique(a2));
        System.out.println(findUnique(a3));
        System.out.println(findUnique(a4));
    }

    public static double findUnique(double arr[]) {
        Arrays.sort(arr);
        double temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (temp == arr[i]) {
                temp = arr[i];
            } else {
                return arr[i];
            }
        }
        return temp;
    }
}
