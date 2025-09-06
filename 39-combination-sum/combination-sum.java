class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        find(result,st,0,candidates,target);
        return result;
    }
    void find(List<List<Integer>> result, Stack<Integer> st, int i, int[] nums, int target) {
        if(i>=nums.length) {
            if(target==0) result.add(new ArrayList<>(st));
            return;
        }
        //skip 
        find(result,st,i+1,nums,target);
        //include 
        if(target>=0) {
            target-=nums[i];
            st.push(nums[i]);
            find(result,st,i,nums,target);
            target+=nums[i];
            st.pop();
        }
    }
}