class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid=low+(high-low)/2;
        int ans[]={-1,-1};
        while(low<=high){
            if(nums[mid]==target) {
                low=mid;
                high=mid;
                while(low>0 && nums[low-1]==target) low--;
                while(high<nums.length-1 && nums[high+1]==target) high++;
                ans[0]=low;
                ans[1]=high;
                return ans;
            }
            else if(target>nums[mid]) low=mid+1;
            else high=mid-1;
            mid=low+((high-low)/2);
        }
        return ans;
    }
}