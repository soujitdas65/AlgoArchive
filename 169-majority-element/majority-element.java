class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0],count=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]==a) count++;
            else a=nums[i];
            if(count>nums.length/2) return a;
        }
        return a;
    }
}