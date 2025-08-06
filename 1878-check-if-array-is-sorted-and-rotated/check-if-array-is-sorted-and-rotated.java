class Solution {
    public boolean check(int[] nums) {
        int count=0,l=nums.length;
        for (int i=1;i<l;i++){
            if(nums[i-1]>nums[i]) count++;
        }
        if(count==0 && nums[0]<=nums[l-1]) return true;
        else if(count==1 && nums[0]>=nums[l-1]) return true;
        return false;
    }
}