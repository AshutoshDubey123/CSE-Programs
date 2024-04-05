class Solution {
    public int countDigits(int num) {
        int temp=num,count=0;

        while(temp!=0){
            int deno=temp%10;  //for finding each digit individually
            temp/=10;         //storing num after removing each digit

            if ( deno > 0    &&    num % deno ==0 )//cheking if found digit divides the number
            count++;
        }
        
        return count;
    }
}