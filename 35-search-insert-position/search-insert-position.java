class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        while (i<n){
            if (nums[i]>=target) break;
            i++;
        }
        return i;
    }
}