//Find Maximum Element
package BasicLevel.MaxMinProblems;

public class MaximumElement {
    public static int maximumElement(int array[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum)
                maximum = array[i];
        }
        return maximum;
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3 };
        System.out.println("The maximum element: " + maximumElement(array));
    }
}
