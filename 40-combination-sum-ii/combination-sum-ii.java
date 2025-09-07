class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        findSum(result,new Stack<>(),0,candidates,target);
        return result;
    }
    void findSum(List<List<Integer>> result,Stack<Integer> st,int i,int[] nums,int target) {
        if(i>=nums.length) {
            if(target==0) result.add(new ArrayList<>(st));
            return;
        }
        //include
        if(target>=nums[i]) {
            st.push(nums[i]);
            findSum(result,st,i+1,nums,target-nums[i]);
            st.pop();
        }
        //skippingDuplicates
        while(i+1<nums.length && nums[i]==nums[i+1]) i++;
        findSum(result,st,i+1,nums,target);
    }
}