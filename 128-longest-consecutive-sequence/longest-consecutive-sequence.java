class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        if(nums.length<=1) return nums.length;
        for(int i=1;i<nums.length;i++){
            int count=1;
            while(i<nums.length && nums[i]-nums[i-1]==1) {
                count++;
                i++;
                while(i<nums.length && nums[i]-nums[i-1]==0)i++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}