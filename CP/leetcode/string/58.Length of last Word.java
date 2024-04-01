class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(count>0){
                    break;
                }
            }
                else{
                    count++;//until i receive a character other thsn space it will not get ++
                    //example "   fly me   to   the moon  "until we reach n cont will not become 1
                }
            }
            
        return count;
        }
       
        
    }
