//Search in rotated sorted array
package BasicLevel.Searching;

public class SearchRotatedSortedArray {
    public static int searchInRotatedArray(int array[], int key) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key)
                return mid;
            if (array[low] <= array[mid]) {
                if (array[low] <= key && key < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (array[mid] < key && key <= array[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3 };
        int value = 3;
        System.out.println("Element found in the index: " + searchInRotatedArray(array, value));
    }
}
