//Left rotate array by d positions 
package IntermediateLevel.RotationProblem;

public class LeftRotateByDPositions {
    public static void reverse(int[] array, int i, int j) {
        while (i < j) {
            int temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
    }

    public static void rotateLeft(int[] array, int d) {
        d = d % array.length;
        reverse(array, 0, d - 1);
        reverse(array, d, array.length - 1);
        reverse(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;

        rotateLeft(arr, d);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
