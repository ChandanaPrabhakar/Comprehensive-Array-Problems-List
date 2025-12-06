//Partition array around pivot
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class PartitionAroundPivot {
    public static int[] partition(int[] array, int pivot) {
        int i = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 12, 3, 5, 14, 10, 10 };
        int pivot = 10;
        System.out.println("Partitioned: " + Arrays.toString(arr));
        System.out.println("array: " + Arrays.toString(partition(arr, pivot)));
    }

}
