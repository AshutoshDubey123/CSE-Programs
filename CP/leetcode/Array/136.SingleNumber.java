class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
          xor=xor^nums[i];
        }
   return xor;  }
}
/*[4,1,2,1,2]
100 4
001 1
-------xor
101
 10 2
-----------xor
111
  1 1
---------xor
110
 10 2
--------------xor
100 4 Ans

 */