class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return generate(nums,goal)-generate(nums,goal-1);
    }
    int generate(int[] nums,int goal) {
        if(goal<0) return 0;
        int i=0,j=0,sum=0,cnt=0;
        while(j<nums.length) {
            sum+=nums[j];
            while(sum>goal) {
                sum-=nums[i];
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}