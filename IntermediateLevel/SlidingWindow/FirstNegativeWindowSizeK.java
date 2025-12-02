//First negative in every window of size k
package IntermediateLevel.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeWindowSizeK {
    public static void firstNegative(int[] array, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            if (array[i] < 0) {
                dq.offerLast(i);
            }

            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    System.out.print(array[dq.peekFirst()] + " ");
                } else {
                    System.out.print(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        System.out.println("First negative in every window of size k: ");
        firstNegative(arr, k);
    }
}
