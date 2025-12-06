//Sort array by absolute difference with target
package IntermediateLevel.Rearrangement;

import java.util.*;

public class SortAbsoluteDifference {
    public static void sortByDiff(int[] array, int target) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int diffA = Math.abs(a - target);
            int diffB = Math.abs(b - target);

            if (diffA != diffB) {
                return diffA - diffB;
            } else {
                return a - b;
            }
        });

        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 9, 2 };
        int target = 7;

        sortByDiff(arr, target);

        System.out.print("Sorted by absolute diff: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
