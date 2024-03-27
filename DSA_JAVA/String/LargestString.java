import java.util.*;

public class LargestString
{   
    public static void main (String args[])
    {
        String comp[]={"Mango","banana","Guava"};
        String largest=comp[0];
        for(int i=1;i<comp.length;i++)
        {
            if(largest.compareTo(comp[i])<0)
            largest=comp[i];
        }
        System.out.println(largest); 
    }
    
}

/*
output:
banana
 */