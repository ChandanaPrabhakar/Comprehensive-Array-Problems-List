//Print array in reverse order
package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

public class PrintArrayInReverse {
    public static void printReverseArray(int n, int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Array elements in reverse order: ");
        printReverseArray(n, array);
        in.close();
    }
}
