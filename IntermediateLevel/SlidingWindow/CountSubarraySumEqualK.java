//Count subarray with sum equal to k
package IntermediateLevel.SlidingWindow;

public class CountSubarraySumEqualK {
    public static int countSubarray(int[] array, int k) {
        int windowSum = 0, left = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];
            while (windowSum > k) {
                windowSum -= array[left++];
            }
            if (windowSum == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 2, 2, 1 };
        int k = 5;
        System.out.println("The count of subarrays equal to k: " + countSubarray(arr, k));
    }
}
