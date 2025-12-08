//Maximum subarray product
package AdvanceLevel.KadaneAlgorithmAndVariation;

public class MaximumSubarrayProduct {
    public static int maxProduct(int[] array) {
        int maxProd = array[0];
        int minProd = array[0];
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(array[i], Math.max(array[i] * maxProd, array[i] * minProd));
            minProd = Math.min(array[i], Math.min(array[i] * temp, array[i] * minProd));
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        System.out.println("Maximum product subarray = " + maxProduct(arr));
    }
}
