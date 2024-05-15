/*Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-2^31 <= n <= 2^31  -1
n is an integer.
Either x is not zero or n > 0.
-10^4 <= x^n <= 10^4*/


class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0; // x^0 = 1
        } else if (n < 0) {
            
            // If n is negative, compute 1 / (x^-n)i.e.,(1/x)^n since n is negative therefore -(-n) is n
            
            x = 1.0 / x;  //  1/x
            // Convert n to long before negating to avoid overflow when n is Integer.MIN_VALUE. When n is a negative integer, negating it using -n can result in an integer overflow. This is because the minimum representable value for a signed 32-bit integer is -2147483648 (INT_MIN), and negating it results in 2147483648, which exceeds the maximum representable value (INT_MAX) which is 2147483647.
            
            long ln = -(long)n; //negating -ve n produces +ve n 
            return pow(x, ln);  //compute 1 / (x^-n)
        }
        return pow(x, n);
    }
    
    private double pow(double x, long n) {
        double result = 1.0;
       
        while (n > 0) {
            // If the current bit of n is 1, multiply the result by the current base
            if ((n & 1) == 1) {
                result *= x;
            }
            // Square the base(x) for the next iteration
            x *= x;
            // Shift n to the right by 1 bit
            n >>= 1;
        }
        return result;
    }
}
