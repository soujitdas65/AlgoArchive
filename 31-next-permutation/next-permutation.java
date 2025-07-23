class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length, index = -1;
        for (int i = l - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1)
            reverse(nums, 0, l - 1);
        else {
            for (int i = l - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            reverse(nums, index + 1, l - 1);
        }
    }

    void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}