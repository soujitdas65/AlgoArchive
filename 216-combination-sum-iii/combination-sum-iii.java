class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        findSum(result,new Stack<>(),1,k,n);
        return result;
    }
    void findSum(List<List<Integer>> result,Stack<Integer> st,int start,int k,int n) {
        if(k==0 && n==0) {
            result.add(new ArrayList<>(st));
            return;
        }
        for(int i=start;i<10;i++) {
            if(n<=0 || k<=0) return;
            //include
            st.push(i);
            findSum(result,st,i+1,k-1,n-i);
            st.pop();
        }
    }
}