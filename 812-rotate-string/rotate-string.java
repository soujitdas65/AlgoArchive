class Solution {
    public boolean rotateString(String s, String goal) {
        int l=s.length();
        while(l-->0){
            StringBuilder first=new StringBuilder(s.substring(0,1));
            StringBuilder rest=new StringBuilder(s.substring(1));
            s=rest.append(first).toString();
            if(s.equals(goal)) return true;
        }
        return false;
    }
}