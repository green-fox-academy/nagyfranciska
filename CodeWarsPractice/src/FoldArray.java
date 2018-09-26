import java.util.Arrays;

public class FoldArray {
    public static void main(String[] args) {

//        Write a method that folds a given array of integers by the middle x-times.
//            Fold 1-times:
//        [1,2,3,4,5] -> [6,6,3]
//            Fold 2-times:
//        [1,2,3,4,5] -> [9,6]

        int[] arr = {1, 2, 5, 7, 3};
        int[] arr2 = {1, 2, 5, 7, 1, 1};
        int runs = 2;
        int runs1 = 1;
        System.out.println(Arrays.toString(foldArray(arr, runs1)));
        System.out.println(Arrays.toString(foldArray(arr, runs)));
        System.out.println(Arrays.toString(foldArray(arr2, runs1)));
        System.out.println(Arrays.toString(foldArray(arr2, runs)));
    }

    public static int[] foldArray(int[] array, int runs) {

        int[] finalArray;

        if (array.length % 2 == 0) {
            finalArray = new int[array.length / 2];
            for (int i = 0; i < finalArray.length; i++) {
                finalArray[i] = array[i] + array[(array.length - 1 - i)];
            }
            runs -= 1;

        } else {
            finalArray = new int[(array.length + 1) / 2];
            for (int i = 0; i < finalArray.length - 1; i++) {
                finalArray[i] = array[i] + array[array.length - 1 - i];
            }
            finalArray[finalArray.length - 1] = array[(array.length + 1) / 2 - 1];
            runs -= 1;
        }

        if (runs != 0) {
            return foldArray(finalArray, runs);
        } else {
            return finalArray;
        }
    }
}
