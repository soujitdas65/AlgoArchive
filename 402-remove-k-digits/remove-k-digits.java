class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        Stack<Character> st=new Stack<>();
        for(char ch:num.toCharArray()) {
            while(!st.empty() && k!=0 && st.peek()>ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0) {
            st.pop();
            k--;
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<st.size();i++) s.append(st.get(i));
        int i=0;
        while(i<s.length() && s.charAt(i)=='0') i++;
        if(i==s.length()) return "0";
        return s.substring(i).toString();
    }
}