//Product of array except self (without division)
package IntermediateLevel.PrefixSum;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productOfArray(int[] array) {
        int result[] = new int[array.length];
        result[0] = 1;
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] * array[i - 1];
        }
        System.out.println("result: " + Arrays.toString(result));

        int rightProduct = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            System.out.println("result:" + result[i]);
            rightProduct *= array[i];
            System.out.println("right product:" + rightProduct);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = productOfArray(arr);

        System.out.print("Product except self: ");
        for (int x : ans)
            System.out.print(x + " ");
    }
}
