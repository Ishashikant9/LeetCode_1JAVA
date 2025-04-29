public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a 2D DP array
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // Deleting all characters
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // Inserting all characters
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no operation
                } else {
                    dp[i][j] = Math.min(
                        dp[i - 1][j - 1], // Replace
                        Math.min(
                            dp[i - 1][j],   // Delete
                            dp[i][j - 1]    // Insert
                        )
                    ) + 1;
                }
            }
        }

        return dp[m][n];
    }

    // Example usage
    public static void main(String[] args) {
        EditDistance solver = new EditDistance();
        String word1 = "horse";
        String word2 = "ros";
        System.out.println("Minimum operations: " + solver.minDistance(word1, word2));
    }
}
