//Smallest positive missing number
package AdvanceLevel.KadaneAlgorithmAndVariation;

public class SmallestMissingNumber {
    public static int findMissing(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            while (array[i] > 0 && array[i] <= n && array[i] != array[array[i] - 1]) {
                int temp = array[i];
                array[i] = array[temp - 1];
                array[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        System.out.println("Smallest missing positive = " + findMissing(arr));
    }
}
