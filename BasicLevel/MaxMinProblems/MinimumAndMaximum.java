//Find minimum and maximum simultaneously
package BasicLevel.MaxMinProblems;

public class MinimumAndMaximum {
    // Pairwise min-max algorithm, asked in (Google, Meta, Amazon) , performance
    // matters
    public static int[] findMinimumAndMaximum(int array[]) {
        int minimum, maximum, i;
        if (array.length % 2 == 0) {
            if (array[0] < array[1]) {
                minimum = array[0];
                maximum = array[1];
            } else {
                minimum = array[1];
                maximum = array[0];
            }
            i = 2;
        } else {
            minimum = maximum = array[0];
            i = 1;
        }

        while (i < array.length - 1) {
            int localMin, localMax;
            if (array[i] < array[i + 1]) {
                localMin = array[i];
                localMax = array[i + 1];
            } else {
                localMin = array[i + 1];
                localMax = array[i];
            }

            if (localMin < minimum) {
                minimum = localMin;
            }
            if (localMax > maximum) {
                maximum = localMax;
            }
            i += 2;
        }

        return new int[] { minimum, maximum };
    }

    // Normal iteration
    public static int[] simultaneousMinMax(int array[]) {
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
        return new int[] { minimum, maximum };
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3, 6, 7 };
        int result1[] = findMinimumAndMaximum(array);
        int result2[] = simultaneousMinMax(array);
        System.out
                .println("The Minimum and Maximum elements (Pairwise Algorithm): " + result1[0] + " and " + result1[1]);
        System.out.println("The Minimum and Maximum elements (Normal iteration): " + result2[0] + " and " + result2[1]);
    }
}
