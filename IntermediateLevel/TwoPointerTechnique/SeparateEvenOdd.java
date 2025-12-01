//Separate even and odd numbers
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static int[] separateEvenOdd(int[] array) {
        int low = 0, i = 0, high = array.length - 1;

        while (i <= high) {
            if (array[i] % 2 == 0) {
                swap(array, i, low);
                low++;
                i++;
            } else {
                swap(array, i, high);
                high--;
            }
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        separateEvenOdd(array);
        System.out.println("Even and Odd numbers separated in array: " + Arrays.toString(array));
    }
}
