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