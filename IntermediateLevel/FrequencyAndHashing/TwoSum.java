//Two Sum
package IntermediateLevel.FrequencyAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int compliment = 0;
        for (int i = 0; i < array.length; i++) {
            compliment = target - array[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(array[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(arr, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
