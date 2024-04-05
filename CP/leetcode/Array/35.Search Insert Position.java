class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        int mid;
	while(l<=r)
	{
		mid=(l+r)/2;
		if(target==nums[mid])
		return mid;
		if(target>nums[mid])
		l=mid+1;
		else
		r=mid-1;		
	}
	
	return l;//it is l not 1
    }
}