//Find element in nearly sorted array
package BasicLevel.Searching;

import java.util.Scanner;

public class FindInNearlySortedArray {
    public static int nearlySortedArray(int array[], int key) {
        int low = 0, high = array.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key)
                return mid;

            if (mid - 1 >= low && key == array[mid - 1]) {
                return mid - 1;
            }

            if (mid + 1 <= high && key == array[mid + 1]) {
                return mid + 1;
            }

            if (key < array[mid]) {
                high = mid - 2;
            } else {
                low = mid + 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = { 20, 10, 30, 50, 40 };
        int value = 50;
        System.out.println("Index of element in nearly sorted array: " + nearlySortedArray(array, value));
        in.close();
    }
}
