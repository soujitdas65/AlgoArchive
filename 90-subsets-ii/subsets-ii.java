class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        findSubset(result,new Stack<>(),0,nums);
        return result;
    }
    void findSubset(List<List<Integer>> result,Stack<Integer> st,int start,int[] nums ) {
        result.add(new ArrayList<>(st));
        for(int i=start;i<nums.length;i++) {
            if(i>start && nums[i]==nums[i-1]) continue;
            st.push(nums[i]);
            findSubset(result,st,i+1,nums);
            st.pop();
        }
    }
}