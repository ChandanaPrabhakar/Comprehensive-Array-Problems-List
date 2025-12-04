//Find first non-repeating element
package IntermediateLevel.FrequencyAndHashing;

import java.util.*;

public class FirstNonRepeatingElement {
    public static Integer findNonRepeation(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : array) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 9, 6, 7, 4 };
        System.out.println("First Non-Repeating Element: " + findNonRepeation(arr));
    }
}
