//Maximum alternating sum subarray
package AdvanceLevel.KadaneAlgorithmAndVariation;

public class MaximumAlternatingSumSubarray {
    public static int maxAlternatingSum(int[] array) {
        int plus = 0, minus = 0;
        for (int i = 0; i < array.length; i++) {
            int newPlus = Math.max(plus, array[i] + minus);
            int newMinus = plus - array[i];

            plus = newPlus;
            minus = newMinus;
        }
        return plus;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 8, 12 };
        System.out.println("Maximum Alternating Sum Subarray = " + maxAlternatingSum(arr));
    }
}
