/*
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

 

Example 1:

Input: nums = [1,4,3,2]
Output: 4
Explanation: All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.
Example 2:

Input: nums = [6,2,6,5,1,2]
Output: 9
Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
 

Constraints:

1 <= n <= 10^4
nums.length == 2 * n
-10^4 <= nums[i] <= 10^4
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        int sum = 0;
        
        // Since the array is sorted, every alternate element forms a pair
        //see the test case and you will get the sequence
        /*[1,4,3,2] becomes[1,2,3,4]
        now min(1,2)+min(3,4)=1+3=4
        */
        
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];//each time minimum is only getting added(since the array is sorted)
        }
        
        return sum;
        
    }
}