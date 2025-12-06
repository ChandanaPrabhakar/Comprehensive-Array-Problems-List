//Rearrange positive negative numbers
package IntermediateLevel.Rearrangement;

public class RearrangePositiveNegativeTwoHalves {
    public static void rearrange(int[] array) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            if (array[left] < 0) {
                left++;
            } else if (array[right] >= 0) {
                right--;
            } else {
                int temp = array[left];
                array[left++] = array[right];
                array[right--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, -2, 5, -1, -7, 8, 4 };
        rearrange(arr);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
