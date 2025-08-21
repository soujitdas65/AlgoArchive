class Solution {
    public String longestPalindrome(String s) {
        String l1=""+s.charAt(0);
        String l2="";
        if(s.length()>1 && s.charAt(0)==s.charAt(1)) 
        l2=s.substring(0,2);
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i-1)==s.charAt(i+1)) l1=expand(s,i,i,l1);
            if(s.charAt(i)==s.charAt(i+1)) l2=expand(s,i,i+1,l2);
        }
        if(l1.length()>=l2.length()) return l1;
        return l2;
    }
    String expand(String s, int i, int j,String l){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        if(l.length()<j-i-1) return s.substring(i+1,j);
        return l;
    }
}