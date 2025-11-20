//Print all elements of an array

package BasicLevel.ArrayTraversalAndBasicOperations;

import java.util.*;

class PrintAllElements {
    public static void printAllElements(int[] array) {
        for (int ele : array) {
            System.out.print(ele + ", ");
        }
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

        printAllElements(array);
        in.close();
    }
}
