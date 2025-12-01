//Maximum sum subarray of size k
package IntermediateLevel.SlidingWindow;

public class MaxSubarraySizeK {
    public static int maxSumSubarray(int[] array, int k) {
        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= array[i - k + 1];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        System.out.println("Maximum sum of subarray size k: " + maxSumSubarray(arr, k));
    }
}
