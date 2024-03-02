import java.util.*;
public class MaxSubarraySumPrefixSum
{   public static void maxsubarraysum(int numbers[])
    {   int maxsum=Integer.MIN_VALUE;//for minimum subarray sum you shoud use minsum=Integer.MAX_VALUE



        int prefix[]= new int[numbers.length];//creating prefix array
        //calculate prefix array
        prefix[0]=numbers[0];//prefix at index 0 is the actual number itself; this is used as putting in formula would lead to index -1
        for(int i=1;i<numbers.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];//formula
        }

 

        for(int i=0;i<numbers.length;i++) //used to access each element of prefix array at each iteration
        {   
            for(int j=i;j<numbers.length;j++) //each time increasing length of subarray for selected i
            {
                int currentsum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];//ternary operator usage 
                //if i==0 curentsum==prefix[j] else currentsum==prefix[j]-prefix[i-1]
                //why using ternary operator
                //if i was 0 then finding prefix[i-1] i.e., (prefix[-1]) was
                // not possible in the formula prefix[j]-prefix[i-1] & 
                //also prefix[-1] is 0 as no element there, thereefore if i==0, currentsum == prefix[j]
                          
            if (currentsum>maxsum)
            maxsum=currentsum;
            }
        }
        System.out.println("The maximum subarray sum:"+maxsum);
    }


    public static void main(String[] args) 
    {
        int numbers[]={1,-2,6,-1,3};
        maxsubarraysum(numbers);
    }
}
/*
 * output
The maximum subarray sum:8
 */