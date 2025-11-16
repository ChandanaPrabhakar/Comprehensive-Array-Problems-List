//Check if array is sorted
package BasicLevel.Searching;

public class CheckIfArraySorted {
    public static boolean checkForSortedArray(int[] array) {
        boolean asc = true, desc = true;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1])
                asc = false;
            if (array[i] > array[i - 1])
                desc = false;
        }
        return asc || desc;
    }

    public static void main(String[] args) {
        int array[] = { 50, 40, 30, 20, 10 };
        System.out.println("Is array sorted: " + checkForSortedArray(array));
    }
}
