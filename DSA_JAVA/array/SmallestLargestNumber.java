//find smallest and largest element in the array
import java.util.*;
class SmallestLargestNumber{
    static int largestnum(int numbers[])
    {
        int smallest=Integer.MAX_VALUE;//corresponds to +infinity, used to find smallest number
        int largest=Integer.MIN_VALUE;//corresponds to -infinity, used to find largest number
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<smallest)
            smallest=numbers[i];

            if(numbers[i]>largest)
            largest=numbers[i];
        }
        System.out.println("Smallest number is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={45,23,100,27,0,1};
        int ans=largestnum(numbers);
        System.out.println("largest number is "+ans);
    }
}

/*output:
Smallest number is 0
largest number is 100
 */

 /*
  other ways
  // storing the largest number to arr[0]
  for (int i = 0; i <= n; i++) {
    if (arr[0] < arr[i]) {
      arr[0] = arr[i];
    }
  }
  Same way for smallest element
  */