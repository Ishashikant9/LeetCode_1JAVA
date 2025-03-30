import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Matrix size
        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();

        // Creating an instance of Solution class
        Solution sol = new Solution();
        int[][] result = sol.generateMatrix(n);

        // Printing the generated spiral matrix
        System.out.println("Generated Spiral Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        
        scanner.close();
    }
}

// Solution class containing the generateMatrix method
class Solution {
    public int[][] generateMatrix(int n) {
        if (n == 0) {
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1, num = 1;

        while (left <= right && top <= bottom) {
            // Move left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Move top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Move right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Move bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }
}
