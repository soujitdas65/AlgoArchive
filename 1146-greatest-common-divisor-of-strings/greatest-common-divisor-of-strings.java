class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int len1=str1.length(),len2=str2.length();
        while(len1!=0) {
            int temp=len2%len1;
            len2=len1;
            len1=temp;
        }
        return str2.substring(0,len2);
    }
}