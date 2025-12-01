//Remove duplicates from sorted array
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int[] removeDuplicates(int[] array) {
        if (array.length == 0)
            return array;
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {
                array[index] = array[i];
                index++;
            }
        }
        while (index < array.length) {
            array[index++] = 0;
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        System.out.println("Remove duplicates from sorted array" + Arrays.toString(array) + ": "
                + Arrays.toString(removeDuplicates(array)));
    }
}
