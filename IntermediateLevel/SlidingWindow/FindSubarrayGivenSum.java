//Find subarray with given sum (positive)
package IntermediateLevel.SlidingWindow;

public class FindSubarrayGivenSum {
    public static void findSubarray(int[] array, int sum) {
        int windowSum = 0, left = 0;
        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];

            while (windowSum > sum && left <= i) {
                windowSum -= array[left++];
            }
            if (windowSum == sum) {
                System.out.println("The subarray with given sum: " + left + " to " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        int target = 33;
        findSubarray(arr, target);
    }
}
