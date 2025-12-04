//First repeating element in array
package IntermediateLevel.FrequencyAndHashing;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
    public static int firstRepeating(int[] array) {
        int repeating = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            if (set.contains(num)) {
                repeating = num;
            } else {
                set.add(num);
            }
        }
        return repeating;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        System.out.println("First repeating element: " + firstRepeating(arr));
    }
}
