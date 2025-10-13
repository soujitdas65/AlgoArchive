class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1,b=-1,c=-1,cnt=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='a') a=i;
            else if(ch=='b') b=i;
            else c=i;
            if(a>=0 && b>=0 && c>=0) 
            cnt+=Math.min(a,Math.min(b,c))+1;
        }
        return cnt;
    }
}