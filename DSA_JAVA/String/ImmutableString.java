import java.util.*;
public class ImmutableString
{
    public static void main(String args[])
    {
        String str="Tony";
        for(char i='a';i<='z';i++)
        {
            str+=i;
        }
    System.out.println(str);
    }
}
/*
 * output:
 * Tonyabcdefghijklmnopqrstuvwxyz
 */