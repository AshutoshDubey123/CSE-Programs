import java.util.*;
class BinarySearch_iterative{

    static int binarysearch(int numbers[],int key)
    {
        int start=0,end=numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //comparisons
            if(numbers[mid]==key)//found
            return mid;
            else if(numbers[mid]>key)//search at right half
            end=mid-1;
            else if (numbers[mid]<key) //search at left half
            start=mid+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={10,20,30,40,50,60,70,80,100};
        int key=70;

        int index=binarysearch(numbers,key);

        System.out.println("index for the key is "+index);

    }
}
/* Output
 * index for the key is 6
 * if it was -1 it means that key is not in list
*/