//Maximum sum increasing subsequence
package AdvanceLevel.KadaneAlgorithmAndVariation;

import java.util.Arrays;

public class MaximumSumIncreasingSubsequence {
    static int fenwick[];

    static void update(int index, int value, int n) {
        while (index <= n) {
            fenwick[index] = Math.max(fenwick[index], value);
            index += index & (-index);
        }
    }

    static int query(int index) {
        int maxVal = 0;
        while (index > 0) {
            maxVal = Math.max(maxVal, fenwick[index]);
            index -= index & (-index);
        }
        return maxVal;
    }

    public static int maxSumIS(int[] array) {
        int n = array.length;

        int[] compressed = array.clone();
        Arrays.sort(compressed);

        fenwick = new int[n + 1];
        Arrays.fill(fenwick, 0);

        int maxSum = 0;

        for (int num : array) {
            int pos = Arrays.binarySearch(compressed, num) + 1;
            int best = query(pos - 1);
            int newSum = best + num;
            update(pos, newSum, n);
            maxSum = Math.max(maxSum, newSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 101, 2, 3, 100, 4, 5 };
        System.out.println("Maximum Sum Increasing Subsequence = " + maxSumIS(arr));
    }
}
