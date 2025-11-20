//Move all zeros to end
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class MoveZeros {
    public static int[] moveZerosToEnd(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[j++] = array[i];
            }
        }
        while (j < array.length) {
            array[j++] = 0;
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = { 1, 0, 3, 0, 5, 0, 7 };
        System.out.println("Move all zeros to end: " + Arrays.toString(moveZerosToEnd(array)));
    }
}
