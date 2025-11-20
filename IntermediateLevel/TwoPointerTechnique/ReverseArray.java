//Reverse an array
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.println("The reverse of array: " + Arrays.toString(reverseArray(array)));
    }
}
