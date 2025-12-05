//Right rotate array by one position
package IntermediateLevel.RotationProblem;

public class RightRotation {
    public static void rotateRight(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        rotateRight(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
