class Solution {
    public int findPeakElement(int[] nums) {
        int l=nums.length;
        if(l==1 || nums[0]>nums[1]) return 0;
        if(nums[l-1]>nums[l-2]) return l-1;
        int low=1,high=l-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) 
                return mid;
            else if(nums[mid-1]>nums[mid]) high=mid-1;
            else low=mid+1; 
        }
        return -1;
    }
}