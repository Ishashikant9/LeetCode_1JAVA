import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        // Predefined array
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // Creating an instance of Solution class and calling majorityElement method
        Solution sol = new Solution();
        int result = sol.majorityElement(nums);

        // Displaying the result
        System.out.println("Majority Element: " + result);
    }
}

// Given Solution class
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;        
    }
}

