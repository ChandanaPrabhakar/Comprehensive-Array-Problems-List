//Largest sum contiguous subarray with unique elements
package AdvanceLevel.KadaneAlgorithmAndVariation;

import java.util.*;

public class LargestUniqueSubarraySum {
    public static int maxUniqueSum(int[] array) {
        int max = 0, currentSum = 0, left = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                currentSum -= array[left];
                set.remove(array[left]);
                left++;
            }
            set.add(array[i]);
            currentSum += array[i];
            max = Math.max(max, currentSum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 4, 5, 6 };
        System.out.println("Largest sum contiguous subarray with unique elements = " + maxUniqueSum(arr));
    }
}
