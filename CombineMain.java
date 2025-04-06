import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        backtrack(1, comb, res, n, k);
        return res;
    }

    private void backtrack(int start, List<Integer> comb, List<List<Integer>> res, int n, int k) {
        if (comb.size() == k) {
            res.add(new ArrayList<>(comb));
            return;
        }

        for (int num = start; num <= n; num++) {
            comb.add(num);
            backtrack(num + 1, comb, res, n, k);
            comb.remove(comb.size() - 1);
        }
    }
}

public class CombineMain {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 4;
        int k = 2;

        List<List<Integer>> combinations = sol.combine(n, k);

        System.out.println("Combinations of " + n + " taken " + k + " at a time:");
        for (List<Integer> combo : combinations) {
            System.out.println(combo);
        }
    }
}
