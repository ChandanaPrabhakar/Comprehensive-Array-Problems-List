//Find duplicates in an array
package IntermediateLevel.FrequencyAndHashing;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        findDuplicates(arr);
    }
}
