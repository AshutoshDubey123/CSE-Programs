import java.util.*;
class BinarySearch_recursive{

    static int binarySearch(int numbers[],int start,int end,int key)
    {
        if (end >= start) 
        {
            int mid = (start + end) / 2;
 
            // If the element i.e.,key is present at the middle itself
            if (numbers[mid] == key)
                return mid;
 
            // If element i.e.,key  is smaller than mid, then it can only be present in left subarray
            if (numbers[mid] > key)
                return binarySearch(numbers, start, mid - 1, key);
 
            // Else the element i.e.,key  can only be present in right subarray
            return binarySearch(numbers, mid + 1, end, key);
        }
 
        // We reach here when element i.e.,key  is not present in array
        return -1;
    }

    public static void main(String args[])
    {
        int numbers[]={10,20,30,40,50,60,70,80,100};
        int key=70;

        int index=binarySearch(numbers,0,numbers.length-1,key);

        System.out.println("index for the key is "+index);

    }
}

/* output
 index for the key is 6
 */