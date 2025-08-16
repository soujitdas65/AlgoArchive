class Solution {
    public String reverseWords(String s) {
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(j)==' ') {
                if(s.charAt(i)!=' ')
                ans=s.charAt(j)+s.substring(i,j)+ans;
                i=j+1;
            }
            j++;
        }
        ans=(s.substring(i,j)+ans).trim();
        return ans;
    }
}