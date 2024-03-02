import java.util.*;
public class PrintSubarrays
{
    public static void subarrays(int numbers[])
    {   int count=0;
        for(int i=0;i<numbers.length;i++) //selects each element i.e., 2 then 4 .....
        {
            for(int j=i;j<numbers.length;j++) //each time increasing length of subarray for selected i
            {
                for(int k=i;k<=j;k++)//printing all subarrays related to above selected element 
                {
                    System.out.print(numbers[k]+" "); 
                
                }
            count++;
            System.out.println();
            }
            System.out.println();
        }
        System.out.println("total no. of subarrays:"+count);
    }

    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        subarrays(numbers);

    }
}

/*
 output: 

 */