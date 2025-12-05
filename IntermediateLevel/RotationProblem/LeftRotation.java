//Left rotate array by one position
package IntermediateLevel.RotationProblem;

public class LeftRotation {
    public static void rotateLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        rotateLeft(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
