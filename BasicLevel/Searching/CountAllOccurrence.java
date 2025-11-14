//Count all occurrence of element
package BasicLevel.Searching;

public class CountAllOccurrence {
    public static int countOccurrence(int array[], int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 3, 5, 3 };
        int value = 3;
        System.out.println("Count of occurrence of element: " + countOccurrence(array, value));
    }
}
