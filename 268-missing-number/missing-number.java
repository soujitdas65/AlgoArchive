class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int num[]=new int[n+1];
        for (int i = 0; i < n; i++)
            num[nums[i]]++;
        int result=0;
        for (int i = 0; i <= n; i++) {
            if (num[i]==0) result=i;
        }
        return result;
    }
}