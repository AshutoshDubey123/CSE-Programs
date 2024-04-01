class Solution {
    public int missingNumber(int[] nums) {
    int i;
    Arrays.sort(nums);
    for(i=0;i<nums.length;i++){
    if(nums[i]!=i)
    break;
        }
     return i;
            
    }
        
    }  
        