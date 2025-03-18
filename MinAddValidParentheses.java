import java.util.*;

class Solution {
    public int minAddToMakeValid(String s) {
        int open_c = 0;
        int close_c = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open_c++;
            } else if (c == ')' && open_c > 0) {
                open_c--;
            } else {
                close_c++;
            }
        }
        return open_c + close_c;
    }
}

public class MinAddValidParentheses {
    public static void main(String[] args) {
        String s = "()))(("; // Predefined input

        Solution sol = new Solution();
        int result = sol.minAddToMakeValid(s);

        System.out.println("Minimum additions to make parentheses valid: " + result);
    }
}
