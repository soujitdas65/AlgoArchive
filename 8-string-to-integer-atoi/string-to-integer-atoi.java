class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        StringBuilder sign=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')i++;
        if(i>=s.length()) return 0;
        if(s.charAt(i)=='+' || s.charAt(i)=='-') 
        sign.append(s.charAt(i++));
        if(i>=s.length()) return 0;
        while(s.charAt(i)>='0' && s.charAt(i)<='9'){
            ans.append(s.charAt(i++));
            if(i>=s.length()) break;
        }
        if(ans.length()==0) return 0;
        String numStr = sign.toString() + ans.toString();
        long num;
        try {
            num = Long.parseLong(numStr); // use long to detect overflow
        } catch (NumberFormatException e) {
            return sign.toString().equals("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        // 6. Clamp to int range
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)num;
    }
}