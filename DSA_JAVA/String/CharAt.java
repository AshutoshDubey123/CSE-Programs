import java.util.*;
public class CharAt{


    public static void printAllLetter(String arr)
    {
        for(int i=0;i<arr.length();i++)
        {
            System.out.print(arr.charAt(i)+" ");
        }
    }
    public static void main (String args[])
    {
        String name;
        name="ASHUTOSH";
        System.out.println(name.charAt(6));


        printAllLetter(name);//print all letters in the string name separated by space
    }
}
/*
S
A S H U T O S H 
 */