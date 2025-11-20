//Find the average of array elements
package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

public class AverageOfArrayElements {
    public static double averageOfArray(int n, int[] array) {
        double avg = 0;
        for (int ele : array) {
            avg += ele;
        }
        return avg / n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("The average of array elements: " + averageOfArray(n, array));
        in.close();
    }
}
