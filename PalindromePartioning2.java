 public class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        int[] minCuts = new int[n];

        for (int i = 0; i < n; i++) {
            int min = i; 
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 1 || isPalindrome[j + 1][i - 1])) {
                    isPalindrome[j][i] = true;
                     min = j == 0 ? 0 : Math.min(min, minCuts[j - 1] + 1);
                }
            }
            minCuts[i] = min;
        }

        return minCuts[n - 1];
    }

     
}
