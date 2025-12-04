//Find frequency of each elements
package IntermediateLevel.FrequencyAndHashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyEachElement {
    public static void findFrequency(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 4, 5, 3, 2, 4 };
        findFrequency(arr);
    }
}
