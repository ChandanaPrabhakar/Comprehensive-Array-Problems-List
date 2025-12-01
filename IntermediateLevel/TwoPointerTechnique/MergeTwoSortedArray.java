//Merge two sorted array
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeSortedArray(int[] a, int[] b, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                a[k--] = a[i--];
            } else {
                a[k--] = b[j--];
            }
        }

        while (j >= 0) {
            a[k--] = b[j--];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 0, 0, 0, 0 };
        int[] b = { 3, 5, 6, 7 };
        System.out.println("Merge two sorted array " + Arrays.toString(a) + " & " + Arrays.toString(b) + ": "
                + Arrays.toString(mergeSortedArray(a, b, 3, 4)));
    }
}
