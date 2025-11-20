//Insert element at specific position
package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

public class InsertAtSpecificPosition {

    // Insert element at specific position
    public static void insertElement(int n, int[] array, int position, int element) {
        int newArray[] = new int[n + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = element;
        for (int i = position; i < n; i++) {
            newArray[i + 1] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    // Insert element at beginning
    public static void insertBeginning(int n, int[] array, int element) {
        int newArray[] = new int[n + 1];
        newArray[0] = element;
        for (int i = 0; i < n; i++) {
            newArray[i + 1] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    // Insert element at end
    public static void insertEnd(int n, int array[], int element) {
        int newArray[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
        System.out.println(Arrays.toString(newArray));
    }

    // Insert element in sorted array
    public static void insertInSortedArray(int n, int[] array, int element) {
        int newArray[] = new int[n + 1];
        int i = 0;
        while (i < array.length && array[i] < element) {
            newArray[i] = array[i];
            i++;
        }
        newArray[i] = element;

        while (i < array.length) {
            newArray[i + 1] = array[i];
            i++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Enter the position: ");
        int position = in.nextInt();
        System.out.println("Enter the element: ");
        int element = in.nextInt();
        System.out.print("Insert element at specific position: ");
        insertElement(n, array, position, element);
        System.out.print("Enter element at the beginning: ");
        insertBeginning(n, array, element);
        System.out.print("Insert element at the end: ");
        insertEnd(n, array, element);
        System.out.print("Insert element in the sorted order: ");
        insertInSortedArray(n, array, element);
        in.close();
    }
}
