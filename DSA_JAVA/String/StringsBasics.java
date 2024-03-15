import java.util.Scanner;

public class StringsBasics{
    public static void main(String args[])
    {
        char arr[]={'a','b','c','d'};
        String str1="abcd";
        String str2=new String("abcd");

        //note: Strings are immuatable i.e., 
        //String once creatrd can't be modified or changed, if you want to change, you have to create new string

        Scanner sc =new Scanner(System.in);
        String name;
       // name=sc.next(); the next function of scanner takes only single word space acts as delimeter 
       //for input Tony Stark it gives only output Tony
        
       
       name=sc.nextLine();//for input Tony Stark it gives full output Tony Stark
       System.out.println(name);

       String fullName="Tony Stark";
       System.out.println(fullName.length());//finding length of string
        

       String firstName="Ashutosh";
       String lastName="Dubey";
       System.out.println(firstName+" "+lastName);//String Concatenation



    }
}

/*
output
Tony Stark
Tony Stark
10
Ashutosh Dubey
 */