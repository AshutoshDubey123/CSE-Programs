import java.util.*;
public class MaxSubarraySumKadensAlgorithmWithPrintingSubarray
{
public static void maxsubarraysum(int numbers[])
{
    int maxsum=Integer.MIN_VALUE;
    int currentsum=0;

    int start = 0;
    int ansStart = -1, ansEnd = -1; //will be used for printing the subarray

    for(int i=0;i<numbers.length;i++)
    {  
        if (currentsum == 0) start = i; // starting index which gets changed each time when currentsum becomes 0

        currentsum=currentsum+numbers[i];

        if(currentsum>maxsum) //is used instead of maxsum=Math.max(currentsum,maxsum); so as to accomodate ansStart=start;
                             //ansEnd=i;
        {
            maxsum=currentsum;
            ansStart=start;
            ansEnd=i;
        }

        if(currentsum<0)
        currentsum=0;

    }
 //printing the subarray:
 System.out.print("The subarray is: [");
 for (int i = ansStart; i <= ansEnd; i++) {
     System.out.print(numbers[i] + " ");
 }
 System.out.print("]");
 System.out.println();
System.out.println("Maximum subarray sum is "+maxsum);
}
public static void main(String args[])
{
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    maxsubarraysum(numbers);
}
}
/*
 output
The subarray is: [4 -1 -2 1 5 ]
Maximum subarray sum is 7
 */