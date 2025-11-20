//Find the difference between largest and smallest element in an array
package BasicLevel.MaxMinProblems;

public class DifferenceBetweenMinAndMax {
    public static int findMinimumAndMaximum(int[] array) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (int ele : array) {
            if (ele > maximum) {
                maximum = ele;
            }
            if (ele < minimum) {
                minimum = ele;
            }
        }
        return maximum - minimum;
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3, 6, 7 };
        System.out.println("The difference between minimum and maximum: " + findMinimumAndMaximum(array));
    }
}
