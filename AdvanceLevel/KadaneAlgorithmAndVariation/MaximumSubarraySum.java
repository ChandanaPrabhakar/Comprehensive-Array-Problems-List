//Maximum subarray sum (Kadane's algorithm)
package AdvanceLevel.KadaneAlgorithmAndVariation;

public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] array) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum subarray sum = " + maxSubarraySum(arr));
    }
}
