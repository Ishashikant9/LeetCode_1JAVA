import java.util.*;

public class MultiplyString {
    public static void main(String[] args) {
        // Predefined input numbers
        String num1 = "123";
        String num2 = "456";

        // Creating an instance of Solution class and calling multiply method
        Solution sol = new Solution();
        String result = sol.multiply(num1, num2);

        // Displaying the result
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
    }
}

// Given Solution class
class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        int[] ans = new int[n + m];

        if (num1.equals("0") || num2.equals("0")) return "0";
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = temp + ans[i + j + 1];
                
                ans[i + j + 1] = sum % 10;
                ans[i + j] += sum / 10;
            }
        }
        
        StringBuilder s = new StringBuilder();
        for (int a : ans) {
            if (!(s.length() == 0 && a == 0)) s.append(a);
        }
        
        return s.length() == 0 ? "0" : s.toString();
    }
}

