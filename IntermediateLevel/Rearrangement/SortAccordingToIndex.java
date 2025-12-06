//Reorder array according to given index
package IntermediateLevel.Rearrangement;

public class SortAccordingToIndex {
    public static void reorder(int[] array, int[] index) {
        for (int i = 0; i < array.length; i++) {
            while (index[i] != i) {
                int newIndex = index[i];

                int temp = array[i];
                array[i] = array[newIndex];
                array[newIndex] = temp;

                temp = index[i];
                index[i] = index[newIndex];
                index[newIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 50, 40, 70, 60, 90 };
        int[] index = { 3, 0, 4, 1, 2 };

        reorder(arr, index);

        System.out.print("Reordered: ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
