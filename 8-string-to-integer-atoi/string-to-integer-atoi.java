class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1,i=0;
        if(s.charAt(i)=='-') {
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+') {
            sign=1;
            i++;
        }
        long ans=0;
        return sign*(int)getNum(i,s,ans,sign);
    }
    long getNum(int i, String s, long ans, int sign) {
        if(i>=s.length() || !Character.isDigit(s.charAt(i)))
        return ans;
        ans=ans*10+s.charAt(i)-'0';
        if(sign*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return getNum(i+1,s,ans,sign);
    }
}