//Longest subarray with sum <= k
package IntermediateLevel.SlidingWindow;

public class LongestSubarrayWithSum {
    public static int longestSubarray(int[] array, int k) {
        int maxLength = 0, windowSum = 0, left = 0;
        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];

            while (windowSum > k) {
                windowSum -= array[left++];
            }
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -1, 2, -3, 4, 1 };
        int k = 3;
        System.out.println("The length of longest subarray with sum <= k: " + longestSubarray(arr, k));
    }
}
