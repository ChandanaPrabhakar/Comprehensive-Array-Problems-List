//Find the first occurrence of element
package BasicLevel.Searching;

import java.util.*;

public class FindFirstOccurrence {
    public static int firstOccurrenceSearch(int array[], int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = { 1, 2, 3, 4, 3, 5 };
        int value = 3;
        System.out.println("Index of first occurrence of the value: " + firstOccurrenceSearch(array, value));
        in.close();
    }
}
