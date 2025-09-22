class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int j=0;j<2;j++) {
            for(int i=nums.length-1;i>=0;i--) {
                while(!st.empty() && st.peek()<=nums[i]) st.pop();
                if(st.empty()) ans[i]=-1;
                else ans[i]=st.peek();
                st.push(nums[i]);
            }
        }
        return ans;
    }
}