/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 10^5
nums[i] is either 0 or 1.
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
        // Initialize variables to track the maximum count and current count of consecutive 1s
        int maxCount=0;
        int curCount=0;

        // Iterate through each element in the array
        for(int element: nums){
            if(element==0){
        //reset curCount and maxCount whenever 0 is encountered.
                if(maxCount<curCount){
                    maxCount=curCount;
                }
                curCount=0;                
            }
            else{
                curCount++;
            }
        }
        
        
        // After the loop, compare the final current count with the maximum count and return the larger value
        return maxCount>curCount? maxCount:curCount;
        
    }
}