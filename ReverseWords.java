public class ReverseWords {
    public static void main(String[] args) {
        // Predefined string
        String s = "  Hello   World  from   Java  ";

        // Creating an instance of Solution class and calling reverseWords method
        Solution sol = new Solution();
        String result = sol.reverseWords(s);

        // Displaying the result
        System.out.println("Reversed words: \"" + result + "\"");
    }
}

// Given Solution class
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
