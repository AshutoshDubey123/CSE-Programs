class Solution {
    public int compress(char[] chars) {
    StringBuilder newStr=new StringBuilder("");
    for(int i=0;i<chars.length;i++){
            Integer count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                
                count++;
                i++;
            }
            newStr.append(chars[i]);

            if(count>1){
                newStr.append(count.toString());
            }


        }
    for(int j=0;j<newStr.length();j++){
        chars[j]=newStr.charAt(j);
    }
    return newStr.length();
    }
    
}