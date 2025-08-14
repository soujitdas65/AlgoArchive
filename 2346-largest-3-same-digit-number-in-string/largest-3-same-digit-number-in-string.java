class Solution {
    public String largestGoodInteger(String num) {
        char ans=' ';
        int count=0;
        for(int i=1;i<num.length();i++){
            if(num.charAt(i)==num.charAt(i-1)) count++;
            else count=0;
            if(count==2) {
                if(ans<num.charAt(i)) ans=num.charAt(i);
            }
        }
        String result="";
        if(ans!=' ') result=result+ans+ans+ans;
        return result; 
    }
}