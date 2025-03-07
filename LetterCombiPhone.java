import java.util.*;

public class LetterCombiPhone {
    public static void main(String[] args) {
        // Predefined input digits
        String digits = "23";

        // Creating an instance of Solution class and calling letterCombinations method
        Solution sol = new Solution();
        List<String> result = sol.letterCombinations(digits);

        // Displaying the result
        System.out.println("Possible letter combinations for " + digits + ": " + result);
    }
}

// Given Solution class
class Solution {
    private int n;
    private String digit;
    private StringBuilder path = new StringBuilder();
    private List<String> ans = new ArrayList<>();
    private String[] store = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private void backtrack(int cur) {
        if (path.length() == n) {
            ans.add(path.toString());
            return;
        }
        String s = store[digit.charAt(cur) - '0'];
        for (char ch : s.toCharArray()) {
            path.append(ch);
            backtrack(cur + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return ans;
        digit = digits;
        n = digit.length();
        backtrack(0);
        return ans;
    }
}
