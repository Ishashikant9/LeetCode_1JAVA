import java.util.*;

// Main class
public class MaxWaterContainer {
    public static void main(String[] args) {
        // Example input: heights of the container walls
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Creating an object of Solution class
        Solution sol = new Solution();
        int result = sol.maxArea(height);

        // Printing the result
        System.out.println("Maximum water that can be contained: " + result);
    }
}

// Solution class with the maxArea function
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
