//Container with most water
package IntermediateLevel.TwoPointerTechnique;

public class ContainerWithMostWater {
    public static int waterContainer(int[] array) {
        int left = 0, right = array.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(array[left], array[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);
            if (array[left] < array[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Maximum water container: " + waterContainer(height));
    }
}
