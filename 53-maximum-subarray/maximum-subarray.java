class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],max=nums[0];
        for (int i=1;i<nums.length;i++){
            if (sum+nums[i]>nums[i]) sum+=nums[i];
            else sum=nums[i];
            if (sum>max) max=sum;
        }
        return max;
    }
}