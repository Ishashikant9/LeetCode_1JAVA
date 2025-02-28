public class ConsecutiveCh {
    public static void main(String[] args) {
        // Predefined string
        String s = "aaabbcddddee";

        // Creating an instance of Solution class and calling maxPower method
        Solution sol = new Solution();
        int result = sol.maxPower(s);

        // Displaying the result
        System.out.println("The maximum power of consecutive characters is: " + result);
    }
}

// Given Solution class
class Solution {
    public int maxPower(String s) {
        if (s.isEmpty()) return 0; // Handle empty string case

        int maxPower = 1;
        int currentStreak = 1;

        for (int i = 1; i < s.length(); i++) { // Start from index 1
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentStreak++;
            } else {
                maxPower = Math.max(maxPower, currentStreak);
                currentStreak = 1;
            }
        }

        return Math.max(maxPower, currentStreak); // Final comparison
    }
}
