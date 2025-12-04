//Find the number occurring odd number of times
package IntermediateLevel.FrequencyAndHashing;

public class OddOccurrence {
    public static int findOdd(int[] array) {
        int result = 0;
        for (int num : array) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5, 4, 4 };
        System.out.println("Number occurring odd number of times: " + findOdd(arr));
    }
}
