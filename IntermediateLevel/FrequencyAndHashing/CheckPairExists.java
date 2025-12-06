//Check if pair with given sum exists
package IntermediateLevel.FrequencyAndHashing;

import java.util.*;

public class CheckPairExists {
    public static boolean checkPair(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int compliment = target - array[i];
            if (map.containsKey(compliment)) {
                return true;
            }
            map.put(array[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 7, 2, 5, 3, 1 };
        int target = 10;

        if (!checkPair(arr, target))
            System.out.println("No such pair exists");
    }
}
