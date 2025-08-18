class Solution {
    public int longestConsecutive(int[] nums) {
        int l=nums.length;
        if(l<=1) return l;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=1;i<l;i++){
            int count=1;
            while(i<l && nums[i]-nums[i-1]==1) {
                count++;
                i++;
                while(i<l && nums[i]-nums[i-1]==0)i++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}