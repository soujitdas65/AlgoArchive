class Solution {
    public long subArrayRanges(int[] nums) {
        int len=nums.length;
        int[] nse=new int[len];
        Stack<Integer> s1=new Stack<>();
        for(int i=len-1;i>=0;i--) {
            while(!s1.empty() && nums[s1.peek()]>=nums[i]) s1.pop();
            nse[i]=(s1.empty()) ? len:s1.peek();
            s1.push(i);
        }
        int[] pse=new int[len];
        Stack<Integer> s2=new Stack<>();
        for(int i=0;i<len;i++) {
            while(!s2.empty() && nums[s2.peek()]>nums[i]) s2.pop();
            pse[i]=(s2.empty()) ? -1:s2.peek();
            s2.push(i);
        }
        int[] nge=new int[len];
        Stack<Integer> s3=new Stack<>();
        for(int i=len-1;i>=0;i--) {
            while(!s3.empty() && nums[s3.peek()]<=nums[i]) s3.pop();
            nge[i]=(s3.empty()) ? len:s3.peek();
            s3.push(i);
        }
        int[] pge=new int[len];
        Stack<Integer> s4=new Stack<>();
        for(int i=0;i<len;i++) {
            while(!s4.empty() && nums[s4.peek()]<nums[i]) s4.pop();
            pge[i]=(s4.empty()) ? -1:s4.peek();
            s4.push(i);
        }
        long largeSum=0,smallSum=0;
        for(int i=0;i<len;i++) {
            largeSum+=(long)(i-pge[i])*(nge[i]-i)*nums[i];
            smallSum+=(long)(i-pse[i])*(nse[i]-i)*nums[i];
        }
        return largeSum-smallSum;
    }
}