/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 
Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?*/

//[Naive Approach] Sorting – O(N * log(N)) Time and O(1) Space:
class Solution {
    public void sortColors(int[] nums) {
       Arrays.sort(nums);
            }
        }


//[Better Approach] Counting 0s, 1s and 2s – Two Pass – O(N) Time and O(1) Space:
class Solution {
    //is a two-pass algorithm because it requires two separate iterations over the array to sort it:
    public void sortColors(int[] nums) {
        int n=nums.length;
        int c0 = 0, c1 = 0, c2 = 0;

        // First Pass - Counting Occurrences: Count 0s, 1s and 2s
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                c0 += 1;
            }
            else if (nums[i] == 1) {
                c1 += 1;
            }
            else {
                c2 += 1;
            }
        }
        //Second Pass - Placing Elements:
        int idx = 0;
        // Place all the 0s
        for (int i = 0; i < c0; i++)
            nums[idx++] = 0;

        // Place all the 1s
        for (int i = 0; i < c1; i++)
            nums[idx++] = 1;

        // Place all the 2s
        for (int i = 0; i < c2; i++)
            nums[idx++] = 2;
    }
}

//[Expected Approach/ most optimized approach] Dutch National Flag Algorithm – One Pass – O(N) Time and O(1) Space:
//you tube: https://www.youtube.com/watch?v=2C4CQ32961Y
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (nums[mid]) {
                // If the element is 0
                case 0: {
                    temp = nums[lo];////swap nums[low] & nums[mid]
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                    // If the element is 1
                case 1:
                    mid++;
                    break;
                    // If the element is 2
                case 2: {
                    temp = nums[mid];//swap nums[mid] & nums[high]
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    
    }
}