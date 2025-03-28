import java.util.*;

// Main class
public class CompareVersionNumbers {
    public static void main(String[] args) {
        // Example inputs
        String version1 = "1.01";
        String version2 = "1.001";

        // Creating an object of Solution class
        Solution sol = new Solution();
        int result = sol.compareVersion(version1, version2);

        // Printing the result
        if (result == 0) {
            System.out.println("Both versions are equal.");
        } else if (result > 0) {
            System.out.println("Version1 is greater.");
        } else {
            System.out.println("Version2 is greater.");
        }
    }
}

// Solution class with the compareVersion function
class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        while (i < version1.length() || j < version2.length()) {
            int num1 = 0, num2 = 0;
            while (i < version1.length() && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i++) - '0');
            }
            while (j < version2.length() && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j++) - '0');
            }
            if (num1 < num2) {
                return -1;
            }
            if (num1 > num2) {
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
