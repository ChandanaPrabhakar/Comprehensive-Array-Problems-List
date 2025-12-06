//Find rotation count in rotation sorted array
package IntermediateLevel.RotationProblem;

public class RotationCount {
    public static int findCount(int[] array) {
        int low = 0, high = array.length - 1;
        while (low <= high) {

            if (array[low] < array[high]) {
                return low;
            }
            int mid = (low + high) / 2;
            int next = (mid + 1) % array.length;
            int prev = (array.length - 1) % array.length;

            if (array[mid] <= array[next] && array[mid] <= array[prev]) {
                return mid;
            }

            if (array[mid] >= array[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 15, 18, 2, 3, 6, 12 };
        System.out.println("Rotation Count = " + findCount(arr));
    }
}
