//Maximum sum circular subarray
package AdvanceLevel.KadaneAlgorithmAndVariation;

public class MaximumSumCircularSubarray {
    public static int kadane(int[] array) {
        int currentSum = 0, maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static int maxCircularSum(int[] array) {
        int totalSum = 0;
        for (int num : array)
            totalSum += num;

        int maxKadane = kadane(array);

        int[] inverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted[i] = -array[i];
        }

        int minKadane = kadane(inverted);

        int circularSum = totalSum + minKadane;
        if (circularSum == 0)
            return maxKadane;

        return Math.max(circularSum, maxKadane);

    }

    public static void main(String[] args) {
        int[] arr = { 5, -3, 5 };
        System.out.println("Maximum circular subarray sum = " + maxCircularSum(arr));
    }
}
