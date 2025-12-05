//Count pair with given sum
package IntermediateLevel.FrequencyAndHashing;

import java.util.*;

public class CountPairWithGivenSum {
    public static int countPairs(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int compliment = target - array[i];
            if (map.containsKey(compliment)) {
                count += map.get(compliment);
            }
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int target = 6;

        System.out.println("Count of pairs = " + countPairs(arr, target));
    }
}
