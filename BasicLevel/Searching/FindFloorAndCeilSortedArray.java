//Find floor and ceiling in sorted array
package BasicLevel.Searching;

public class FindFloorAndCeilSortedArray {
    public static int[] findFloorAndCeil(int[] array, int key) {
        int low = 0, high = array.length;
        int floor = -1, ceil = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return new int[] { array[mid], array[mid] };
            }
            if (array[mid] < key) {
                floor = array[mid];
                low = mid + 1;
            } else {
                ceil = array[mid];
                high = mid - 1;
            }
        }
        return new int[] { floor, ceil };
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int key = 27;
        int[] result = findFloorAndCeil(array, key);
        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}
