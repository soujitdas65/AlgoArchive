class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1,b=-1,c=-1,cnt=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='a') a=i;
            else if(ch=='b') b=i;
            else c=i;
            if(a!=-1 && b!=-1 && c!=-1) {
                int min=Math.min(a,Math.min(b,c));
                cnt+=min+1;
            }
        }
        return cnt;
    }
}