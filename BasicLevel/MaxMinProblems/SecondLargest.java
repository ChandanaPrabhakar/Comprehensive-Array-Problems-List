//Find second largest element
package BasicLevel.MaxMinProblems;

public class SecondLargest {
    public static int secondLargestElement(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            } else if (array[i] > secondLargest && array[i] != max) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3 };
        System.out.println("The maximum element: " + secondLargestElement(array));
    }
}
