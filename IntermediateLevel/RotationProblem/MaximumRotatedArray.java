//Find maximum in rotated sorted array
package IntermediateLevel.RotationProblem;

public class MaximumRotatedArray {
    public static int findMaximum(int[] array) {
        int low = 0, high = array.length - 1;
        if (array[low] < array[high]) {
            return array[high];
        }
        while (low <= high) {
            int mid = (high + low) / 2;
            if (mid < high && array[mid] > array[mid + 1]) {
                return array[mid];
            }

            if (low < mid && array[mid] < array[mid - 1]) {
                return array[mid - 1];
            }

            if (array[mid] >= array[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 1, 2, 3 };
        System.out.println("Maximum value = " + findMaximum(arr));
    }
}
