//Segregate 0s and 1s
package IntermediateLevel.Rearrangement;

public class SegregateZerosAndOnes {
    public static void segregate(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] == 0) {
                left++;
            } else if (array[right] == 1) {
                right--;
            } else {
                int temp = array[left];
                array[left++] = array[right];
                array[right--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 0, 0 };
        segregate(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
