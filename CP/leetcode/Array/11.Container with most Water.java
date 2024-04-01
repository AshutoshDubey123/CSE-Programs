class Solution {
    public int maxArea(int[] height) {
    int res=0;//resultant area
    int lin=0;//left index
    int rin=height.length-1;//right index
    while(lin<rin)
    { int left=height[lin];//height of left index
    int right=height[rin];//height of right index
    int area=Math.min(left,right)*(rin-lin);
    
    res=Math.max(res,area);//taking maximum resultant area
    
    if(left<right)
    lin++;// Move the left pointer towards the centre if the left line is shorter
    else
    rin--;// Move the right pointer towards the centre if the right line is shorter or equal to the left line
    
    }
    return res;
     }
    }