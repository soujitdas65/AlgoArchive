class Solution {
    public String reverseWords(String s) {
        String str="",result="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') {
                count=0;
                str=str+s.charAt(i);
            }
            else{
                count++;
                if(count==1)result=s.charAt(i)+str+result;
                str="";
            }
        }
        result=(str+result).trim();
        return result;
    }
}