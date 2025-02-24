import java.util.HashSet;

public class CheckIfExist {
    public static void main(String[] args) {
        // Predefined array
        int[] arr = {10, 2, 5, 3};

        // Creating an instance of Solution class and calling checkIfExist method
        Solution sol = new Solution();
        boolean result = sol.checkIfExist(arr);

        // Displaying the result
        System.out.println("Does the array contain a number and its double? " + result);
    }
}

// Given Solution class
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
