public class Pow {
    public static void main(String[] args) {
        // Predefined base (x) and exponent (n)
        double x = 2.0;
        int n = -3;

        // Creating an instance of Solution class and calling myPow method
        Solution sol = new Solution();
        double result = sol.myPow(x, n);

        // Displaying the result
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}

// Given Solution class
class Solution {
    public double myPow(double x, int n) {
        if (n >= 0)
            return positive(x, n);
        else
            return negative(x, n);
    }

    private double negative(double x, int n) {
        if (n == -1) // Fix base case for negative exponent
            return 1 / x;

        double smallOutput = myPow(x, n / 2);
        if (n % 2 == 0)
            return smallOutput * smallOutput;
        else
            return (1 / x) * smallOutput * smallOutput;
    }

    private double positive(double x, int n) {
        if (n == 0)
            return 1;

        double smallOutput = myPow(x, n / 2);
        if (n % 2 == 0)
            return smallOutput * smallOutput;
        else
            return x * smallOutput * smallOutput;
    }
}
