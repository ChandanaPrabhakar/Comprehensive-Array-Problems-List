//Find Kth smallest element
package BasicLevel.MaxMinProblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int findKthSmallestElement(int array[], int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : array) {
            maxHeap.add(ele);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3, 6, 7 };
        int k = 3;
        System.out.println("The Kth smallest element: " + findKthSmallestElement(array, k));
    }
}
