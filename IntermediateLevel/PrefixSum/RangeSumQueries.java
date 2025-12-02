//Range Sum Queries
package IntermediateLevel.PrefixSum;

import java.util.Arrays;

public class RangeSumQueries {
    public static int[] buildPrefix(int[] array) {
        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
        return prefixSum;
    }

    public static int rangeSum(int[] prefixSum, int l, int r) {
        if (l == 0)
            return prefixSum[r];
        return prefixSum[r] - prefixSum[l - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 4, 6 };
        int prefix[] = buildPrefix(arr);

        System.out.println("Prefix Sum Array: " + Arrays.toString(prefix));

        System.out.println("Sum from 1 to 3: " + rangeSum(prefix, 1, 3));
        System.out.println("Sum from 0 to 4: " + rangeSum(prefix, 0, 4));
    }
}
