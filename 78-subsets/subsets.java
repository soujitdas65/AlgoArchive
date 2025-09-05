class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        generate(0,nums,st,result);
        return result;
    }
    void generate(int i,int[] nums,Stack<Integer> st,List<List<Integer>> result) {
        if(i==nums.length){
            result.add(new ArrayList<>(st));
            return;
        }
        generate(i+1,nums,st,result);//Choice:skip
        st.push(nums[i]);//Choice:choose
        generate(i+1,nums,st,result);
        st.pop();
    }
}