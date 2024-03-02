import java.util.*;
public class ReverseAnArray
{
   public static void reverse(int numbers[])
   {
    int first=0,last=numbers.length-1;
    
    while (first<last)
    {
       numbers[first] = numbers[first] + numbers[last];
        numbers[last] = numbers[first] - numbers[last];
        numbers[first] = numbers[first] - numbers[last];  //swapping without using 3rd variable
        
        first++;
        last--;
    }

   }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);//passing array as argument in method is done through pass by reference
        //(if we change the value of variable inside the method. The change is reflected outside the method as well)

        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }
}

/*
 * output: 10 8 6 4 2 
 */

