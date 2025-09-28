class Solution {
    public int largestRectangleArea(int[] heights) {
        int len=heights.length;
        long area=Integer.MIN_VALUE;
        int[] pse=new int[len];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<heights.length;i++) {
            while(!st.empty() && heights[st.peek()]>=heights[i]) {
                int temp=st.pop();
                area=Math.max(area,(long)(heights[temp]*(i-pse[temp]-1)));
            }
            pse[i]=(st.empty()) ? -1:st.peek();
            st.push(i);
        }
        while(!st.empty()) {
            int temp=st.pop();
            area=Math.max(area,(long)(heights[temp]*(len-pse[temp]-1)));
        }
        return (int)area;
    }
}