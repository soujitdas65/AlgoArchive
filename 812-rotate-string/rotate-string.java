class Solution {
    public boolean rotateString(String s, String goal) {
        int i=0;
        while(i++<s.length()){
            StringBuilder first=new StringBuilder(s.substring(0,i));
            StringBuilder rest=new StringBuilder(s.substring(i));
            if(rest.append(first).toString().equals(goal)) return true;
        }
        return false;
    }
}