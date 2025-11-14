//Binary search in sorted array
package BasicLevel.Searching;

public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int low = 0, high = array.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key)
                return mid;
            else if (array[mid] < key)
                low = mid;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int value = 3;
        System.out.println("Element found in the index: " + binarySearch(array, value));
    }
}
