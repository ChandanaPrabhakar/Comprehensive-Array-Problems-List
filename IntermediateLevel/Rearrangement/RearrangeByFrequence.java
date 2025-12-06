//Rearrange array element by frequency
package IntermediateLevel.Rearrangement;

import java.util.*;

public class RearrangeByFrequence {
    public static void rearrange(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            if (map.get(b) != map.get(a)) {
                return map.get(b) - map.get(a);
            } else {
                return a - b;
            }
        });

        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 8, 5, 6, 8, 8 };
        rearrange(arr);

        System.out.print("Rearranged by frequency: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
