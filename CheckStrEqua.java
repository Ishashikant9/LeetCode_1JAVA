public class CheckStrEqua {
    public static void main(String[] args) {
        // Predefined string arrays
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        // Creating an instance of Solution class and calling arrayStringsAreEqual method
        Solution sol = new Solution();
        boolean result = sol.arrayStringsAreEqual(word1, word2);

        // Displaying the result
        System.out.println("Are the two string arrays equal? " + result);
    }
}

// Given Solution class
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String word : word1) {
            str1.append(word);
        }
        for (String word : word2) {
            str2.append(word);
        }
        return str1.toString().equals(str2.toString());
    }
}
