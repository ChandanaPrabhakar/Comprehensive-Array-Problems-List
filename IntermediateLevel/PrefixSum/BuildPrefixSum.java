//Build prefix sum array
package IntermediateLevel.PrefixSum;

import java.util.Arrays;

public class BuildPrefixSum {
    public static int[] prefixSumArray(int[] array) {
        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4 };
        int[] prefix = prefixSumArray(arr);

        System.out.println(Arrays.toString(prefix));
    }

}
