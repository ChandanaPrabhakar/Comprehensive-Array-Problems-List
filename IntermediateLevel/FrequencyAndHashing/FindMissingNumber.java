//Find missing number ( 0 to n )
package IntermediateLevel.FrequencyAndHashing;

public class FindMissingNumber {
    public static int missingNumber(int[] array, int n) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            ans ^= i;
        }

        for (int i = 0; i < array.length; i++) {
            ans ^= array[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        int n = 6;
        System.out.println("Missing number: " + missingNumber(arr, n));
    }
}
