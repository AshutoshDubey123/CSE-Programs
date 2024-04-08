/*
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
//-1 because because arrays and strings in Java are zero-indexed, meaning the indices start from 0.
        int j = b.length() - 1;
        
        int carry = 0;
        
        while(i >= 0 || j >= 0)//loop continues until a single digit is left
        {
            
            int sum = carry;
            
// Now, we subtract by '0'(only this is the use of '0') to convert the numbers from a char type into an int, so we can perform operations on the numbers
            if(i >= 0) sum += a.charAt(i--) - '0';//Here, we decrement i after getting the digit. 
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;

            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
