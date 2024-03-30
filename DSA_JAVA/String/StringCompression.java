import java.util.*;
//consecutive repeating characters
public class StringCompression{
    public static String string_Compression(String str){
        StringBuilder newStr=new StringBuilder("");
        
        for(int i=0;i<str.length();i++){
            Integer count=1;//count has been made object of Integer class type as it is used below as object for.toString()
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){//i<str.length()-1 is used so that 
                //while using charAt(i+1) we don't receive an error
                count++;
                i++;
            }
            newStr.append(str.charAt(i));

            if(count>1){
                newStr.append(count.toString());
            }


        }
    return newStr.toString();//StringBuilder has been converted to String type
    }
    /*
    the overall time complexity of the code is O(n), not O(n^2). This is because even though there is a nested loop, 
    the total number of iterations across both loops is linearly dependent on the length of the input string.
    i++ is happening in one loop, is reflected in other loop also.
    sbhi operations string ke length tk hi ho rhe hai
     */
    public static void main(String[] args) {
        String str="aaaabbcdddaa";
        System.out.println(string_Compression(str));
    }
}
/*
output:
a4b2cd3a2
//consecutive repeating characters
 */