//Linear search - find element in array
package BasicLevel.Searching;

import java.util.*;

public class LinearSearch {
    public static int linearSearch(int array[], int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter the value: ");
        int value = in.nextInt();
        System.out.println("Element found in the index: " + linearSearch(array, value));
        in.close();
    }
}
