//Count distinct elements in array
package IntermediateLevel.FrequencyAndHashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static int countDistinct(int[] array) {
        Set<Integer> seen = new HashSet<>();

        for (int num : array) {
            if (!seen.contains(num)) {
                seen.add(num);
            }
        }
        return seen.size();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 2, 4, 7, 8, 8 };
        System.out.println("Number of distinct elements: " + countDistinct(arr));
    }
}
