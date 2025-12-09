//Sort array of 0s, 1s, 2s
package AdvanceLevel.SortingRelated;

public class SortArray {
    public static void sortColors(int[] array) {
        int low = 0, mid = 0, high = array.length - 1;
        while (mid <= high) {
            switch (array[mid]) {
                case 0: {
                    int temp1 = array[low];
                    array[low] = array[mid];
                    array[mid] = temp1;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int temp2 = array[mid];
                    array[mid] = array[high];
                    array[high] = temp2;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColors(arr);
        for (int num : arr)
            System.out.print(num + " ");
    }
}
