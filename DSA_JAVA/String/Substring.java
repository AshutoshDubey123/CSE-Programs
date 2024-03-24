import java.util.*;

public class Substring
{
public static String subString(String str,int startIndex,int endIndex)

{ String ans="";//within this you will store the substring
for(int i=startIndex;i<endIndex;i++)
{
    ans=ans+str.charAt(i);//or ans+=str.charAt(i)
}
return ans;
}


public static void main(String args[])
{
String str="HelloWorld";
System.out.println(str.substring(0,5));//inbuilt substring function


System.out.println(subString(str,0,5));//string printed from startindex to endindex-1

}

}

/*
output
Hello
Hello
 */