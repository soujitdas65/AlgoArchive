class Solution {
    public boolean isPalindrome(String s) {
        boolean result=true;
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            String str1=""+s.charAt(i);
            String str2=""+s.charAt(j);
            i++;
            j--;
            if(!str1.equalsIgnoreCase(str2)) result=false;
        }
        return result;
    }
}