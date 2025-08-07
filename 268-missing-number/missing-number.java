class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,l=nums.length;
        for(int i=1;i<=l;i++) sum+=nums[i-1];
        int realSum=l*(l+1)/2;
        return realSum-sum;
    }
}