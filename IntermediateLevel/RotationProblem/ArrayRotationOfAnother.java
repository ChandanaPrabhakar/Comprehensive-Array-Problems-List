//Check if array is rotation of another array
package IntermediateLevel.RotationProblem;

import java.util.Arrays;

public class ArrayRotationOfAnother {
    public static boolean isRotation(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;
        String string1 = Arrays.toString(array1).replaceAll("[\\[\\], ]", "");
        String string2 = Arrays.toString(array2).replaceAll("[\\[\\], ]", "");
        String combined = string1 + string1;

        return combined.contains(string2);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 1, 2 };

        System.out.println("Is rotation? " + isRotation(arr1, arr2));
    }
}
