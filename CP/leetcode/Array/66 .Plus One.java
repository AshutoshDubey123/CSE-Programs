/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.*/
/*3 cases exist
a.digit into consideration !=9, simply add 1 to it and return
b.digit into consideration =9, just make it zero and continue
c.when all digits are 9, go on making each digit zero and then increase the size of arry by 1 and add 1 to 0th index*/

class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
                digits[i]++;
                break;
            }
            else
            {
                digits[i]=0;
            }
        }

        if(digits[0]==0) //all digits were 9 and adding 1 constinuously through for loop makes them all zero
        {
            int res[]=new int[n+1];//increase the size of array by 1
            res[0]=1;//add 1 to 0th index
            return res;
        }
    return digits;

    }
}