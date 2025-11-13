//Count total number of elements
package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

public class CountNumberOfElements {
    // Built-In function Time Complexity: O(1)
    public static int countElements(int[] array) {
        return array.length;
    }

    // Manual counting using loop Time Complexity: O(n)
    public static int countElementsManually(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = { 1, 3, 5, 7, 9, 11 };
        System.out.println("The total number of elements in an array: " + countElements(array));
        System.out.println("The total number of elements in an array (Manual Counting): " + countElements(array));
        in.close();
    }
}
