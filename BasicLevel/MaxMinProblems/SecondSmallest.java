//Find second smallest element
package BasicLevel.MaxMinProblems;

public class SecondSmallest {
    public static int secondSmallestElement(int[] array) {
        int min = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMinimum = min;
                min = array[i];
            } else if (array[i] < secondMinimum && array[i] != min) {
                secondMinimum = array[i];
            }
        }
        return secondMinimum;
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3 };
        System.out.println("The maximum element: " + secondSmallestElement(array));
    }
}
