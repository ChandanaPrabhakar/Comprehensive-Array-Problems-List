//Find all pair with given difference
package IntermediateLevel.FrequencyAndHashing;

import java.util.*;

public class FindPairWithDifference {
    public static void findPairs(int[] array, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        for (int num : array) {
            if (set.contains(num + k)) {
                System.out.println("( " + num + ", " + (num + k) + " )");
            }
            if (set.contains(num - k)) {
                System.out.println("( " + num + ", " + (num - k) + " )");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 35, 2, 50, 80 };
        int k = 45;
        findPairs(arr, k);
    }
}
