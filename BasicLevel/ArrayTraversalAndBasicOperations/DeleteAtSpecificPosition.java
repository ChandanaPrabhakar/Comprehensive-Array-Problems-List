//Delete element from specific position
package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

public class DeleteAtSpecificPosition {
    // Delete element from the specific index
    public static void deleteFromSpecificPosition(int n, int[] array, int position) {
        int newArray[] = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != position) {
                newArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // Delete element from the beginning
    public static void deleteFromBeginning(int n, int[] array) {
        int[] newArray = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            newArray[i] = array[i + 1];
        }
        System.out.println(Arrays.toString(newArray));
    }

    // Delete element from the end
    public static void deleteFromEnd(int n, int[] array) {
        int newArray[] = Arrays.copyOf(array, n - 1);
        System.out.println(Arrays.toString(newArray));
    }

    // Delete by value (first occurrence)
    public static void deleteByValue(int n, int[] array, int value) {
        int newArray[] = new int[n - 1];
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                position = i;
                break;
            }
        }
        if (position == -1)
            System.out.println("The value not found in array");
        for (int i = 0, j = 0; i < n; i++) {
            if (i != position) {
                newArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Enter the position: ");
        int position = in.nextInt();
        System.out.println("Enter the value: ");
        int value = in.nextInt();
        System.out.print("Delete element from specific position: ");
        deleteFromSpecificPosition(n, array, position);
        System.out.print("Delete from the beginning: ");
        deleteFromBeginning(n, array);
        System.out.print("Delete from the end: ");
        deleteFromEnd(n, array);
        System.out.print("Delete element by first occurrence of value: ");
        deleteByValue(n, array, value);
        in.close();
    }
}
