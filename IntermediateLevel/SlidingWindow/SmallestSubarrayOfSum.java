//Smallest subarray with sum >= target
package IntermediateLevel.SlidingWindow;

public class SmallestSubarrayOfSum {
    public static void smallestSubarray(int[] array, int target) {
        int windowSum = 0, left = 0, minLength = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];
            while (windowSum >= target) {
                minLength = Math.min(minLength, i - left + 1);
                windowSum -= array[left++];
            }
        }
        System.out.println("The smallest subarray with sum >= target: " + minLength);
    }

    public static void main(String[] args) {
        int array[] = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        smallestSubarray(array, target);
    }
}
