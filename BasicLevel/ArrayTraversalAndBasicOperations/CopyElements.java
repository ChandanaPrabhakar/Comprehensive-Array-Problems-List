//Copy elements from one array to another
package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

public class CopyElements {
    // Manual copying - easy - time complexity: O(n)
    public static void copyElements(int n, int[] array) {
        int[] duplicateArray = new int[n];
        for (int i = 0; i < n; i++) {
            duplicateArray[i] = array[i];
        }
        System.out.println(Arrays.toString(duplicateArray));
    }

    // System.arraycopy(sourceArray, sourceStart, destinationArray,
    // destinationStart, array.length) - medium - fastest - time complexity: O(n)
    public static void copyElementsSystemArrayCopy(int n, int[] array) {
        int[] duplicateArray = new int[n];
        System.arraycopy(array, 0, duplicateArray, 0, n);
        System.out.println(Arrays.toString(duplicateArray));
    }

    // Arrays.copyOf - easiest - fast - time complexity: O(n)
    public static void copyElementsArraysCopyOf(int n, int[] array) {
        int[] duplicateArray = Arrays.copyOf(array, n);
        System.out.println(Arrays.toString(duplicateArray));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("THe elements in duplicate array (Manual copying): ");
        copyElements(n, array);

        System.out.print("THe elements in duplicate array (System.arraycopy): ");
        copyElementsSystemArrayCopy(n, array);

        System.out.print("THe elements in duplicate array (Arrays.copyOf): ");
        copyElementsArraysCopyOf(n, array);
        in.close();
    }
}
