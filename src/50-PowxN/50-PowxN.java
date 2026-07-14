// Last updated: 7/14/2026, 12:17:11 PM
class Solution {
    public double myPow(double x, int n) {
        long N = n; // promote to long to avoid overflow
        if (N < 0) {
            return 1.0 / powHelper(x, -N);
        }
        return powHelper(x, N);
    }

    private double powHelper(double x, long n) {
        // Base case
        if (n == 0) return 1.0;

        // Divide and conquer
        double half = powHelper(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}