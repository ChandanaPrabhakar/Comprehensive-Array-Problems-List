//Find last occurrence of element
package BasicLevel.Searching;

public class FindLastOccurrence {
    public static int lastOccurrenceSearch(int array[], int value) {
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                position = i;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 3, 5, 3 };
        int value = 3;
        System.out.println("The index of last occurrence of element: " + lastOccurrenceSearch(array, value));
    }
}
