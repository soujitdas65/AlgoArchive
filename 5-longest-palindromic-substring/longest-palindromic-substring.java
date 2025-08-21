class Solution {
    public String longestPalindrome(String s) {
        String ans=""+s.charAt(0);
        for(int i=0;i<s.length()-1;i++){
            ans=expand(s,i,i,ans);
            ans=expand(s,i,i+1,ans);
        }
        return ans;
    }
    String expand(String s, int i, int j,String ans){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        if(ans.length()<j-i-1) return s.substring(i+1,j);
        return ans;
    }
}