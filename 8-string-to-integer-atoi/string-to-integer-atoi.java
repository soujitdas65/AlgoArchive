class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int l=s.length(), i=0, sign=1;
        if(l==0) return 0;
        if(s.charAt(i)=='+') {
            sign=1;
            i++;
        }
        else if(s.charAt(i)=='-') {
            sign=-1;
            i++;
        }
        long ans=0;
        return sign*(int)extractNumbers(s,sign,i,l,ans);
    }
    long extractNumbers(String s, int sign, int index, int length, long ans) {
        if(index==length) return ans;
        if(Character.isDigit(s.charAt(index))) {
            ans=ans*10+s.charAt(index)-'0';
            if(sign*ans>Integer.MAX_VALUE) 
            return Integer.MAX_VALUE;
            else if(sign*ans<Integer.MIN_VALUE) 
            return Integer.MIN_VALUE;
        }
        else return ans;
        return extractNumbers(s, sign, index+1, length, ans);
    }
}