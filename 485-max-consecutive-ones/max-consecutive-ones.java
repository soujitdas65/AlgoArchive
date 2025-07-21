class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,a=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1) a++;
            else a=0;
            if (max<a) max=a;
        }
        return max;
    }
}