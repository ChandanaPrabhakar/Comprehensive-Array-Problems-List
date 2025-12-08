//Maximum sum of non adjacent elements
package AdvanceLevel.KadaneAlgorithmAndVariation;

public class MaximumSumNonAdjacent {
    public static int maxNonAdjacentSum(int[] array) {
        int exclude = 0, include = 0;

        for (int i = 0; i < array.length; i++) {
            int newInclude = array[i] + exclude;
            int newExclude = Math.max(include, exclude);

            include = newInclude;
            exclude = newExclude;
        }
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 10, 7 };
        System.out.println("Maximum non-adjacent sum = " + maxNonAdjacentSum(arr));
    }
}
