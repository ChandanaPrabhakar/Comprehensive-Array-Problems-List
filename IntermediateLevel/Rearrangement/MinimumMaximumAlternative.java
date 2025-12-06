//Rearrange array in max-min form
package IntermediateLevel.Rearrangement;

public class MinimumMaximumAlternative {
    public static void rearrange(int[] array) {
        int left = 0, right = array.length - 1;
        int maxValue = array[right] + 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] += (array[right--] % maxValue) * maxValue;
            } else {
                array[i] += (array[left++] % maxValue) * maxValue;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] /= maxValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rearrange(arr);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
