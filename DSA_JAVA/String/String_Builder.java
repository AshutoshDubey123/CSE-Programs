import java.util.*;
public class String_Builder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char i='a';i<='z';i++){
            sb.append(i);
        }
        System.out.println(sb);
    }
}
/*time complexity= O(n) as no copying of string occurs at each iteration, changes are made to same string 
at each iteration unlike ImmutableString*/
/*
output: abcdefghijklmnopqrstuvwxyz
 */