import java.util.*;
public class TrappingRainwater
{

public static int trappedRainwater(int height[])
{
int n=height.length;

//calculate left max boundary-using auxillary array
int leftMax[]=new int[n];
leftMax[0]=height[0];
for(int i=1;i<n;i++)
{
    leftMax[i]=Math.max(height[i],leftMax[i-1]);
}
//calculate right max boundary-using auxillary array
int rightMax[]=new int[n];
rightMax[n-1]=height[n-1];
for(int i=n-2;i>=0;i--)
{
    rightMax[i]=Math.max(height[i],rightMax[i+1]);
}

int trappedWater=0;
//loop
for(int i=0;i<n;i++)
{//waterlevel=min(leftmax bound,rightmax bound)
 int waterLevel=Math.min(leftMax[i],rightMax[i]);
 //trapped water=waterlevel-height[i]
 trappedWater+=waterLevel-height[i];//we will go on adding into trappedWater at each iteration to get final trappedWater
 //right hand is not multiplied by width as it is given that width of each index is 1
}

return trappedWater;

}
public static void main(String args[])
{
    int height[]={4,2,0,6,3,2,5};
    System.out.println("Trapped Water: "+trappedRainwater(height));
}
}

/*Output
Trapped Water: 11
 */