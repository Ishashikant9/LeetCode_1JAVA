import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums = {1, 2, 3}; // Example input
        List<List<Integer>> result = sol.permute(nums);

        System.out.println("All permutations: ");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> singleList = new ArrayList<>();
            singleList.add(nums[0]);
            res.add(singleList);
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int[] remainingNums = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    remainingNums[index] = nums[j];
                    index++;
                }
            }
            
            List<List<Integer>> perms = permute(remainingNums);
            for (List<Integer> p : perms) {
                p.add(n);
            }
            
            res.addAll(perms);
        }
        
        return res;        
    }
}
