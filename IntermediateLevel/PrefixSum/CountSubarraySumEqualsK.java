//Count subarray sum equals k
package IntermediateLevel.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEqualsK {
    public static int countSubarray(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, prefix = 0;
        map.put(0, 1);
        for (int num : array) {
            prefix += num;

            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -1, 2 };
        int k = 3;
        System.out.println("Count of subarrays with sum = k: " + countSubarray(arr, k));
    }
}
