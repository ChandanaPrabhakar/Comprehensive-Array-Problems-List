//Subarray with given sum (including negative)
package IntermediateLevel.SlidingWindow;

public class SubarrayWithGivenSum {
    public static void subarraySum(int[] array, int target) {
        int windowSum = 0, left = 0;
        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];
            while (windowSum > target) {
                windowSum -= array[left++];
            }
            if (windowSum == target) {
                System.out.println("Subarray with given sum: " + left + " to " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        int sum = 33;
        subarraySum(arr, sum);
    }

}
