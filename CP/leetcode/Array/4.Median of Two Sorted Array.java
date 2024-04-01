class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int m=nums1.length;
        int n=nums2.length;
        int a=m+n;
        vector<int> nums3(a);
        merge(nums1.begin(), nums1.end(), nums2.begin(), nums2.end(), nums3.begin());
        if(a%2!=0)
        {
            return nums3[a/2];
        }
        else
        {/*int b=nums3[(a-1)/2];
        int c=nums3[(a-1)/2+1];
        int d=(b+c);
        int e=d/2;
        double g=d%2;
        double h=e+g;
        return h;*/
        int b = nums3[(a - 1) / 2];
        int c = nums3[(a - 1) / 2 + 1];
        return (double)(b + c) / 2;//if you don't provide double it will give only2.00000 instead of 2.50000
        }  
    }
}