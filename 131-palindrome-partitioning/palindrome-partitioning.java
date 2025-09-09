class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        palindrome(result,new Stack<>(),s,0);
        return result;
    }
    void palindrome(List<List<String>> result,Stack<String> st,String s,int start) {
        if(start==s.length()) {
            result.add(new ArrayList<>(st));
            return;
        }
        //include 
        for(int i=start;i<s.length();i++) {
            if(checkPalindrome(s.substring(start,i+1))) {
                st.push(s.substring(start,i+1));
                palindrome(result,st,s,i+1);
                st.pop();
            }
        } 
    }
    boolean checkPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}