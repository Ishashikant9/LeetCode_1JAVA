import java.util.HashMap;
import java.util.Map;

public class LongPalindrome {
    public static void main(String[] args) {
        // Predefined string
        String s = "abccccdd";

        // Creating an instance of Solution class and calling longestPalindrome method
        Solution sol = new Solution();
        int result = sol.longestPalindrome(s);

        // Displaying the result
        System.out.println("Length of the longest palindrome that can be built: " + result);
    }
}

// Given Solution class
class Solution {
    public int longestPalindrome(String s) {
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }
        if (oddCount > 1)
            return s.length() - oddCount + 1;
        return s.length();
    }
}

