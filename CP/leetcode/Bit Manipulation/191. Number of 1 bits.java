/*
Write a function that takes the binary representation of a positive integer and returns the number of set bits it has (also known as the Hamming weight).

 

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

 

Constraints:

1 <= n <= 2^31 - 1
*/

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
        if((n&1)==1)//check LSB whether it is set(i.e., 1) or not
        count++;     
        
            n=n>>1;//at each iteration we right shift n until n doesn't become zero
        
        
        }
        
 return count;   }
}