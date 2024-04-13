/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 10^5
1 <= nums[i] <= n
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       

        boolean [] visited= new boolean[nums.length+1]; 
        //A boolean array is initialized to false 
        for(int i =0; i< nums.length; i++){
            visited[nums[i]] = true;
//positions corresponding to nums in visited boolean array is marked true
        }
        
        List<Integer> ans= new ArrayList<>();
        
         for(int i =1; i<= nums.length; i++){
//If the boolean array indicates that the current number is not visited 
     
            if(!visited[i]) //when if condition true it is added
            ans.add(i);
        }
        return ans;
        
    }
}