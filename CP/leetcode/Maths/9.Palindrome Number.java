/*
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-2^31 <= x <= 2^31 - 1
 */
/*class Solution {
    public boolean isPalindrome(int x) {
                                        int reversed = 0, remainder, original;

    

    original = x;

    // reversed integer is stored in reversed variable

    while (x >= 0) {

        remainder = x % 10;

        reversed = reversed * 10 + remainder;// main line which you may forget

        x /= 10;

    }

    // palindrome if orignal and reversed are equal

    if (original == reversed)

        return true;
    else

        return false;                   
                                       
                                        
                                        

    }
}Gives time limit exceeded 
Negative numbers are not palindromes, so we should return false immediately if x is negative. Here's the corrected code:*/
class Solution {

    public boolean isPalindrome(int x) {

        // For negative numbers, return false

        if (x < 0)

            return false;

        int reversed = 0, remainder, original;

        original = x;

        // reversed integer is stored in reversed variable

        while (x != 0) {

            remainder = x % 10;

            reversed = reversed * 10 + remainder;

            x /= 10;

        }

        // palindrome if original and reversed are equal

        return original == reversed;

    }

}