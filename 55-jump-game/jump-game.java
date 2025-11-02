class Solution {
    public boolean canJump(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(i+nums[i]>=nums.length-1) return true;
            if(nums[i]==0 && i>=max) return false;
            max=Math.max(max,i+nums[i]);
        }
        return true;
    }
}