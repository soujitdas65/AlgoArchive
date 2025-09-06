class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        find(result,st,0,candidates,0,target);
        return result;
    }
    void find(List<List<Integer>> result, Stack<Integer> st, int i, int[] nums, int sum, int target) {
        if(i>=nums.length || sum>target) {
            if(sum==target) result.add(new ArrayList<>(st));
            return;
        }
        //skip 
        find(result,st,i+1,nums,sum,target);
        //include 
        sum+=nums[i];
        st.push(nums[i]);
        find(result,st,i,nums,sum,target);
        sum-=nums[i];
        st.pop();
    }
}