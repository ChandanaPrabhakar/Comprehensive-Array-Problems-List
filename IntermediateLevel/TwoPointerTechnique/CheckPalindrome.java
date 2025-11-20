//Check if array is palindrome
package IntermediateLevel.TwoPointerTechnique;

public class CheckPalindrome {
    public static boolean checkPalindrome(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.println("Check if array is palindrome: " + checkPalindrome(array));
    }
}
