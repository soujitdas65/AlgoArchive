class Solution {
    public int countHillValley(int[] nums) {
        int l = nums.length, count = 0;
        for (int i = 1; i < l - 1; i++) {
            if (nums[i] != nums[i - 1]) {
                int left = i - 1, right = i + 1;
                while (right < l && nums[right] == nums[i])
                    right++;
                if (right < l) {
                    if (nums[left] > nums[i] && nums[right] > nums[i])
                        count++;
                    if (nums[left] < nums[i] && nums[right] < nums[i])
                        count++;
                }
            }
        }
        return count;
    }
}