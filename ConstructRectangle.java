import java.util.Arrays;

public class ConstructRectangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int area = 12; // Predefined test case
        int[] result = sol.constructRectangle(area);

        System.out.println("Width: " + result[0] + ", Length: " + result[1]);
    }
}

class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        if (area == 0) {
            return result;
        }
        int a = (int) Math.sqrt(area);
        while (area % a != 0) {
            a--;
        }
        int b = area / a;
        result[0] = b;
        result[1] = a;
        return result;
    }
}
