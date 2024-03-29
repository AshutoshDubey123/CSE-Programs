import java.util.*;
public class FirstLettersofWordsUppercase{
    public static String uppercase(String str){
        StringBuilder sb=new StringBuilder("");//empty string builder

        char ch =Character.toUpperCase(str.charAt(0));//Character represents chararacter class//index zero always capital
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){  //' ' to read space and append it 
                sb.append(str.charAt(i));
                i++;//make next character after space as capital and append it 
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));//just append rest of character without worrying too much
            }
        }
    return sb.toString();//convert the stringbuilder to string 
    } 
    public static void main(String[] args) {
        String str ="hello i am tony";
        System.out.println(uppercase(str));
    }
}
/*
output: Hello I Am Tony
 */