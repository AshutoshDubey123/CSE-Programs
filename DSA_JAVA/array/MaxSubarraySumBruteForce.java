import java.util.*;
public class MaxSubarraySumBruteForce
{
    public static void maxsubarraysum(int numbers[])
    {   int maxsum=Integer.MIN_VALUE;//for minimum subarray sum you shoud use minsum=Integer.MAX_VALUE
        for(int i=0;i<numbers.length;i++) //selects each element i.e., 2 then 4 .....
        {   
            for(int j=i;j<numbers.length;j++) //each time increasing length of subarray for selected i
            {int currentsum=0;
                for(int k=i;k<=j;k++)//finding sum for current subarray   
                {
                    currentsum=numbers[k]+currentsum;
                
                }
                
            System.out.print(currentsum+" ");
            if (currentsum>maxsum)
            maxsum=currentsum;
            }
        System.out.println();
        }
        System.out.println("The maximum subarray sum:"+maxsum);
    }

    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        maxsubarraysum(numbers);

    }
}
/*
 * output
2 6 12 20 30 
4 10 18 28 
6 14 24 
8 18 
10 
The maximum subarray sum:30
 */