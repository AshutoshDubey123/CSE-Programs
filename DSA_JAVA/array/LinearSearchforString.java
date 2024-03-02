import java.util.*;
class LinearSearchforString{
    static int favourite(String menu[],String key)
    {
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i].equals(key))//you may hava used == also instead of .equals
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[]={"dosa","chole bhature","chowmin","phuchka","momos"};
        String key="chowmin";
        
        int index=favourite(menu,key);

        if(index==-1)
        System.out.println("item not found in menu");
        else
        System.out.println("item "+key+" found in menu at index:"+index);//way to use multiple + in java
    }
}
/* 
 Output:
 item chowmin found in menu at index:2
*/