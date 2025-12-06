//Rearrange in alternative positive and negative numbers
package IntermediateLevel.Rearrangement;

public class RearrangePositiveNegative {
    public static void rearrange(int[] array) {
        int wrongIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (wrongIndex != -1) {
                if ((array[wrongIndex] >= 0 && array[i] < 0) || (array[wrongIndex] < 0 && array[i] >= 0)) {
                    int temp = array[i];
                    for (int j = i; j > wrongIndex; j--) {
                        array[j] = array[j - 1];
                    }
                    array[wrongIndex] = temp;

                    if (i - wrongIndex >= 2)
                        wrongIndex += 2;
                    else
                        wrongIndex = -1;
                }
            }

            if (wrongIndex == -1 && ((array[i] >= 0 && i % 2 != 0) || (array[i] < 0 && i % 2 == 0))) {
                wrongIndex = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, -2, 5, -1, -7, 8, 4 };
        rearrange(arr);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
