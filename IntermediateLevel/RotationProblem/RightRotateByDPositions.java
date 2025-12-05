//Right rotate array by d positions
package IntermediateLevel.RotationProblem;

public class RightRotateByDPositions {
    public static void reverse(int[] array, int i, int j) {
        while (i < j) {
            int temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
    }

    public static void rotateRight(int[] array, int d) {
        int n = array.length;
        d = d % n;

        reverse(array, 0, n - 1);
        reverse(array, 0, d - 1);
        reverse(array, d, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;

        rotateRight(arr, d);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
