class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1) {
                if (mid>0 && nums[mid] == nums[mid - 1])
                    low = mid + 1;
                else if (mid<nums.length-1 && nums[mid] == nums[mid + 1])
                    high = mid - 1;
                else
                    return nums[mid];
                mid = low + (high - low) / 2;
            } else {
                if (mid>0 && nums[mid] == nums[mid - 1])
                    high = mid - 1;
                else if (mid<nums.length-1 && nums[mid] == nums[mid + 1])
                    low = mid + 1;
                else
                    return nums[mid];
                mid = low + (high - low) / 2;
            }
        }
        return ans;
    }
}