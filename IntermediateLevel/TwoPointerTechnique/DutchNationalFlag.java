//Dutch national flag problem (sort 0s, 1s, 2s)
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class DutchNationalFlag {
    public static int[] dutchNationalFlag(int[] array) {
        int low = 0, mid = 0, high = array.length - 1;
        while (mid <= high) {
            if (array[mid] == 0) {
                swap(array, low++, mid++);
            } else if (array[mid] == 1) {
                mid++;
            } else {
                swap(array, mid, high--);
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
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        dutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr));
    }
}
