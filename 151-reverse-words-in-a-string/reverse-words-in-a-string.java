class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int i=s.length()-1,j=0;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')i--;
            if(i<0)break;
            j=i;
            while(i>=0 && s.charAt(i)!=' ')i--;
            ans.append(s.substring(i+1,j+1)).append(" ");
        }
        return ans.toString().trim();
    }
}