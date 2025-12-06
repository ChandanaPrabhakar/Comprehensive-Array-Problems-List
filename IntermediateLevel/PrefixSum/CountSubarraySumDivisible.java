//Count number of subarrays with sum divisible by k
package IntermediateLevel.PrefixSum;

import java.util.*;

public class CountSubarraySumDivisible {
    public static int countSubarrays(int[] array, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        int prefix = 0;
        int count = 0;
        freq.put(0, 1);
        for (int num : array) {
            prefix += num;
            int remainder = prefix % target;
            if (remainder < 0) {
                remainder += target;
            }
            if (freq.containsKey(remainder)) {
                count += freq.get(remainder);
            }

            freq.put(remainder, freq.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, -2, -3, 1 };
        int k = 5;

        System.out.println("Count of subarrays divisible by k: " + countSubarrays(arr, k));
    }
}
