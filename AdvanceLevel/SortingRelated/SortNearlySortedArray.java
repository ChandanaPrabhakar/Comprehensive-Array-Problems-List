//Sort nearly sorted array
package AdvanceLevel.SortingRelated;

import java.util.PriorityQueue;

public class SortNearlySortedArray {
    public static void sortNearlySorted(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;

        for (int i = 0; i <= k; i++) {
            minHeap.add(array[i]);
        }

        for (int i = k + 1; i < array.length; i++) {
            array[index++] = minHeap.poll();
            minHeap.add(array[i]);
        }

        while (!minHeap.isEmpty()) {
            array[index++] = minHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 12, 56, 8 };
        int k = 3;
        sortNearlySorted(arr, k);
        for (int num : arr)
            System.out.print(num + " ");
    }
}
