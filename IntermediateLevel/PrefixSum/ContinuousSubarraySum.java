//Continuous subarray sum (multiple of k)
package IntermediateLevel.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static boolean continuousSubarrays(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefix = 0;

        map.put(0, -1);

        for (int i = 0; i < array.length; i++) {
            prefix += array[i];

            int remainder = (k == 0) ? prefix : prefix % k;
            if (remainder < 0)
                remainder += k;
            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                } else {
                    map.put(remainder, i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 2, 4, 6, 7 };
        int k = 6;
        System.out.println(continuousSubarrays(arr, k));
    }
}
