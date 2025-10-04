class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++) {
            if(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.removeFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) dq.removeLast();
            dq.addLast(i);
            if(i>=k-1) ans[i-k+1]=nums[dq.peekFirst()];
        }
        return ans;
    }
}