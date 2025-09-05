class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        generate(0,nums,st,result);
        return result;
    }
    void generate(int i,int[] nums,Stack<Integer> st,List<List<Integer>> result) {
        result.add(new ArrayList<>(st));
        while(i<nums.length) {  
            st.push(nums[i]);
            generate(i+1,nums,st,result);
            st.pop();
            i++;
        }
    }
}