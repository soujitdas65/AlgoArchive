class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = -1;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                i = j;
                break;
            }
        }
        if (i != -1) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] != 0) {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    i++;
                }
            }
        }
    }
}