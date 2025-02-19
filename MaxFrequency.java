import java.util.Arrays;

public class MaxFrequency {
    public static void main(String[] args) {
        // Predefined array
        int[] nums = {1, 3, 2, 2, 3, 3, 1, 4, 2};

        // Creating an instance of Solution class and calling maxFrequencyElements method
        Solution sol = new Solution();
        int result = sol.maxFrequencyElements(nums);

        // Displaying the result
        System.out.println("Maximum Frequency Sum: " + result);
    }
}

// Given Solution class
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        Arrays.sort(freq);
        int i = 100;
        int ans = freq[i];

        while (freq[i] == freq[i - 1]) {
            ans += freq[i];
            i--;
        }
        return ans;
    }
}

