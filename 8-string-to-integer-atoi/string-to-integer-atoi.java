class Solution {
    public int myAtoi(String s) {
        int l=s.length();
        if(l==0) return 0;
        int i=0;
        while(i<l && s.charAt(i)==' ') i++;
        if(i-l==0) return 0;
        int sign=1;
        if(s.charAt(i)=='+') {
            sign=1;
            i++;
        }
        else if(s.charAt(i)=='-') {
            sign=-1;
            i++;
        }
        long ans=0;
        while(i<l && Character.isDigit(s.charAt(i))){
            ans=ans*10+s.charAt(i)-'0';
            i++;
            if(sign*ans>Integer.MAX_VALUE) 
            return Integer.MAX_VALUE;
            else if(sign*ans<Integer.MIN_VALUE) 
            return Integer.MIN_VALUE;
        }
        return sign*(int)ans;
    }
}