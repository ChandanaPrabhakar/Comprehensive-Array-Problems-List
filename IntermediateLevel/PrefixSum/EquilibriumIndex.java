//Find equilibrium index
package IntermediateLevel.PrefixSum;

public class EquilibriumIndex {
    public static void findEquilibrium(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < array.length; i++) {
            int rightSum = totalSum - leftSum - array[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium index found at: " + i);
            }
            leftSum += array[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        findEquilibrium(arr);
    }
}
