import java.util.*;

// Main class
public class SubsetsGenerator {
    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3};

        // Creating an object of Solution class
        Solution sol = new Solution();
        List<List<Integer>> subsets = sol.subsets(nums);

        // Printing the result
        System.out.println("All subsets: " + subsets);
    }
}

// Solution class with the subsets function
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}

