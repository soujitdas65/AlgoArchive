class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        int[] nums=new int[9];
        for(int i=1;i<10;i++) nums[i-1]=i;
        findSum(result,new Stack<>(),0,nums,k,n);
        return result;
    }
    void findSum(List<List<Integer>> result,Stack<Integer> st,int i,int[] nums,int k,int n) {
        if(k==0 && n==0) {
            result.add(new ArrayList<>(st));
            return;
        }
        if(i>=nums.length) return;
        //include
        st.push(nums[i]);
        findSum(result,st,i+1,nums,k-1,n-nums[i]);
        st.pop();
        //skip
        findSum(result,st,i+1,nums,k,n);
    }
}