//Rearrange elements alternatively (max, min, max, min)
package IntermediateLevel.TwoPointerTechnique;

import java.util.Arrays;

public class RearrangeElementsAlternately {
    public static int[] rearrange(int[] array) {
        int n = array.length;
        int maxIndex = n - 1;
        int minIndex = 0;
        int maxElement = array[maxIndex] + 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] += (array[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                array[i] += (array[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }
        for (int i = 0; i < n; i++) {
            array[i] = array[i] / maxElement;
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(
                "Rearrange elements alternatively ( max, min, max, min ): " + Arrays.toString(rearrange(array)));
    }
}
