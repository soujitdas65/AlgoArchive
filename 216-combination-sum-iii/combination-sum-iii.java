class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        int[] nums=new int[9];
        for(int i=1;i<10;i++) nums[i-1]=i;
        findSum(result,new Stack<>(),0,nums,k,n);
        return result;
    }
    void findSum(List<List<Integer>> result,Stack<Integer> st,int start,int nums[],int k,int n) {
        if(st.size()==k && n==0) {
            result.add(new ArrayList<>(st));
            return;
        }
        for(int i=start;i<nums.length;i++) {
            if(i>start && nums[i]==nums[i-1]) continue;
            if(nums[i]>n || st.size()>k) break;
            //include
            st.push(nums[i]);
            findSum(result,st,i+1,nums,k,n-nums[i]);
            st.pop();
        }
    }
}