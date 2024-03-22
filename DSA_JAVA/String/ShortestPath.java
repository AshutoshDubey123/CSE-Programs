import java.util.*;
public class ShortestPath
{  public static float shortestPathSteps(String str)
    {
        int x=0,y=0;
        for(int i=0;i<str.length();i++)
        {   //north
            if(str.charAt(i)=='N')
            y=y+1;
            //south
            else if(str.charAt(i)=='S')
            y=y-1;
            //west
            else if(str.charAt(i)=='W')
            x=x-1;
            //east
            else if(str.charAt(i)=='E')
            x=x+1;

        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);//typecast so as to get decimal number when situation arises
    }
    public static void main(String args[])
    {
        String str="WNEENESENNN";
        System.out.println(shortestPathSteps(str));
    }
}