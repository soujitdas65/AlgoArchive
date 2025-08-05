class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=nums.length;
        if(nums.length==1 || nums[0]!=nums[1]) return nums[0];
        if(nums[l-1]!=nums[l-2]) return nums[l-1];
        int low=0,high=l-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) 
                return nums[mid];
            else if((mid%2==1 && nums[mid]!=nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid-1]))
                high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}