class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        /*in-place algorithm means it modifies the input in place, 
        without creating a separate copy of the data structure.*/
        int k=1;//index 0 is always unique
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
            nums[k]=nums[i];
            k++;
            }
            
        }
       
        return k;
//in test case 1 output array is 1 2 2 (last 2 is _ )we are only concerned till k<2 i.e., index 0 & 1
         
    }
}