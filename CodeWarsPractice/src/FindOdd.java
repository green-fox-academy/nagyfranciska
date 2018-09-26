import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static void main(String[] args) {

//        Given an array, find the int that appears an odd number of times

        int[] a1 = new int[]{ -8, -8, 7, 6, 6 };
        int[] a2 = new int[]{ 0, 0, -202, 13, 13, 13, 13 };

        System.out.println(findIt(a1));
        System.out.println(findIt(a2));
    }

    public static int findIt(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();
        int odd = 0;

        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                odd = key;
            }
        }
        return odd;
    }
}
