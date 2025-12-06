//Maximum of all subarrays of size k
package IntermediateLevel.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfAllSubarrays {
    public static void maximumElementInSubarray(int[] array, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && array[dq.peekLast()] <= array[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                System.out.print(array[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        System.out.println("Maximum of all elements in subarrays of size k: ");
        maximumElementInSubarray(array, k);
    }
}
