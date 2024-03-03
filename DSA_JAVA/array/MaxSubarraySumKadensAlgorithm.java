import java.util.*;
public class MaxSubarraySumKadensAlgorithm
{
public static void maxsubarraysum(int numbers[])
{
    int maxsum=Integer.MIN_VALUE;
    int currentsum=0;

    for(int i=0;i<numbers.length;i++)
    {
        currentsum=currentsum+numbers[i];

        maxsum=Math.max(currentsum,maxsum);

        if(currentsum<0)
        currentsum=0;

    }
System.out.println("Maximum subarray sum is "+maxsum);
}
public static void main(String args[])
{
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    maxsubarraysum(numbers);
}
}