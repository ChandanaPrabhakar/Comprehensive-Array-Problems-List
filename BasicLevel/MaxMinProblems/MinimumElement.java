//Find minimum element
package BasicLevel.MaxMinProblems;

public class MinimumElement {
    public static int minimumElement(int array[]) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3 };
        System.out.println("The minimum element: " + minimumElement(array));
    }
}
