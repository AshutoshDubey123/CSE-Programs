class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                return new int[] {i,j};
/*in java you can't directly return array writing return {i,j} 
Instead, you need to explicitly create an array and then return it.*/
            }
        }

       return new int[]{-1,-1};
    }
}