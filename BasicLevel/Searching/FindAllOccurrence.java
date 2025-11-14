//Find all occurrence of element
package BasicLevel.Searching;

import java.util.*;

public class FindAllOccurrence {
    public static void allOccurrence(int[] array, int value) {
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                count.add(i);
        }
        System.out.println("The indices of all the occurrence of element: " + count);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 3, 5, 3 };
        int value = 3;
        allOccurrence(array, value);
    }
}
