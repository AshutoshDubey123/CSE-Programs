/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-2^31 <= n <= 2^31 - 1
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }     
            return (n& (n-1))==0;
/*while binary operators themselves do not return true or false, the result of their operation can be used in boolean expressions to evaluate conditions.
example:
int a = 5;
int b = 3;

boolean result = (a & b) == 0; // result will be false as the result of the bitwise AND operation is 0

        */
    }
}