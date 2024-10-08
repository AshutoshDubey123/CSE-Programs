/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
 

Constraints:

1 <= nums.length <= 3 * 10^4
-2^31 <= nums[i] <= 2^31 - 1
Each element in nums appears exactly three times except for one element which appears once.
 */
import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        // Step 1: Sort the array in non-decreasing order
        Arrays.sort(nums);
        
        // Step 2: Iterate through the array in steps of 3
        // Every element that appears three times should occur consecutively.
        // Check every group of three elements if they are the same.
        // If not, the first element of the group is the single element.
        for (int i = 1; i < nums.length; i = i + 3) {
            // Compare the current element with the previous one
            // If they are not the same, the previous one (nums[i-1]) is the unique element
            if (nums[i - 1] != nums[i]) {
                return nums[i - 1]; // Return the unique element
            }
        }
        
        // Step 3: If no unique element was found in the loop, 
        // then the unique element must be the last one in the array (since the rest are groups of 3)
        return nums[nums.length - 1]; // Return the last element
    }
}
