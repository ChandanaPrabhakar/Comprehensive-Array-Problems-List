//Find kth largest element
package BasicLevel.MaxMinProblems;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargestElement(int array[], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int ele : array) {
            minHeap.add(ele);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3, 6, 7 };
        int k = 3;
        System.out.println("The Kth largest element: " + findKthLargestElement(array, k));
    }
}
