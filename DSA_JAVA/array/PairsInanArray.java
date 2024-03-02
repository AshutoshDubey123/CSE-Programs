import java.util.*;
public class PairsInanArray
{
    public static void Pairs(int numbers[])
    { 
        int count=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                count++;
            }
        System.out.println();
        }
    System.out.println("total no pairs:"+count);
    }


    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        Pairs(numbers);
    }
}
/*
 Output:
(2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)

total no pairs:10
 */