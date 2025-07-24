class Solution {
    public int longestConsecutive(int[] nums) {
        int l=nums.length;
        int count=1,max=0;
        if(l<=1) max=l;
        Arrays.sort(nums);
        for(int i=1;i<l;i++){
            if(nums[i]-nums[i-1]==1) count++;
            else if(nums[i-1]==nums[i]);
            else count=1;
            max=Math.max(count,max);
        }
        return max;
    }
}