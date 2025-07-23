class Solution {
    public String reverseWords(String s) {
        int n=s.length(),count=0;
        String result="",str="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (ch==' ') {
                if (count==0){
                    result=str+" "+result;
                    str="";
                }
                count++;
            }
            else {
                count=0;
                str=str+ch;
            }
        }
        result=str+" "+result;
        result=result.trim();
        return result;
    }
}