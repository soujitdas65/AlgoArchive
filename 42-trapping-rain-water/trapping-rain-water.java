class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int[] right=new int[len];
        int[] left=new int[len];
        Stack<Integer> st=new Stack<>();
        for(int i=len-1;i>=0;i--) {
            while(!st.empty() && st.peek()<=height[i]) st.pop();
            right[i]=(st.empty()) ? -1 : st.peek();
            st.push(height[i]);
        }
        while(!st.empty()) st.pop();
        for(int i=0;i<len;i++) {
            while(!st.empty() && st.peek()<=height[i]) st.pop();
            left[i]=(st.empty()) ? -1 : st.peek();
            st.push(height[i]);
        }
        int cnt=0;
        for(int i=1;i<len-1;i++) {
            if(left[i]!=-1 && right[i]!=-1) {
                int back=i,front=i;
                while(back>=0 && left[back]!=-1) back--;
                while(front<len && right[front]!=-1) front++;
                int newHeight=Math.min(height[back],height[front]);
                cnt+=newHeight-height[i];
            }
        }
        return cnt;
    }
}