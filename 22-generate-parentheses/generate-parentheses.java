class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        generate(n,0,0,list,s);
        return list;
    }
    void generate(int n,int open, int close,List<String> list,StringBuilder s) {
        if(open==n && close==n) {
            list.add(s.toString());
            System.out.println(s);
            return;
        }
        if(open<n){
            s.append("(");
            generate(n,open+1,close,list,s);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open) {
            s.append(")");
            generate(n,open,close+1,list,s);
            s.deleteCharAt(s.length()-1);
        }
    }
}