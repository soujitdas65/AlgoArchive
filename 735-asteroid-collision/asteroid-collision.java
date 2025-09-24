class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++) {
            if(st.empty()) st.push(asteroids[i]);
            else if(asteroids[i]<0 && st.peek()>0) {
                int n=asteroids[i]*-1;
                while(!st.empty() && st.peek()<n && st.peek()>0) st.pop();
                if(st.empty() || st.peek()<0) st.push(asteroids[i]); 
                else if(st.peek()==n) st.pop();
            }
            else st.push(asteroids[i]);
        }
        int[] ans=new int[st.size()];
        for(int i=0;i<st.size();i++) ans[i]=st.get(i);
        return ans;
    }
}