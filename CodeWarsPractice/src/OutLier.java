import java.util.ArrayList;
import java.util.List;

public class OutLier {
    public static void main(String[] args) {

//        You are given an array (which will have a length of at least 3, but could be very large)
//        containing integers. The array is either entirely comprised of odd integers or entirely
//        comprised of even integers except for a single integer N. Write a method that takes the array
//        as an argument and returns this "outlier" N.

//        [2, 4, 0, 100, 4, 11, 2602, 36]
//        Should return: 11 (the only odd number)
//
//        [160, 3, 1719, 19, 11, 13, -21]
//        Should return: 160 (the only even number)

        int[] a1 = {1, 3, 5, 8, 7, 9};
        int[] a2 = {0, 2, 4, 6, 8, 3};

        System.out.println(Integer.toString(findOutlier(a1)));
        System.out.println(Integer.toString(findOutlier(a2)));
    }

    public static int findOutlier(int[] array) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (Integer number : array) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }
        if (even.size() > odd.size()) {
            return odd.get(0);
        }
        return even.get(0);
    }
}
