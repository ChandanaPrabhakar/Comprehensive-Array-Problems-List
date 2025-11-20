//Find the sum of all elements
package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

public class SumAllElements {
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int ele : array) {
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("The sum of all elements in an array: " + sumOfArray(array));
        in.close();
    }
}
