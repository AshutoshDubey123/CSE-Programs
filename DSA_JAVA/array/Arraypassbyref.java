//argument passing in method is done through pass by reference
import java.util.*;

class Arraypassbyref{
static void update(int marks[],int nonchangeable )
{   nonchangeable=10;
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    }
}    

public static void main(String args[])
    {
    int marks[]={97,98,99};

    int nonchangeable=5;

    update(marks,nonchangeable);//main being static can only call static method, that is why update method is made static

    System.out.println(nonchangeable);//non-array variable so pass by value works 
    //here and remains unchanged after result from call comes
    for(int i=0;i<marks.length;i++)
    {
        System.out.print(marks[i]+" ");
    }
    }
}
/*Output
5
98 99 100 */ 