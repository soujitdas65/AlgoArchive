class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j=nums.length-1;
        for (int i=1;i<=j;i++){
            if ((nums[j]-nums[j-1])!=1) return nums[j]-1;
            if ((nums[i]-nums[i-1])!=1) return nums[i]-1;
            j--;       
        }
        if ((nums[0])!=0) return 0;
        return nums[nums.length-1]+1;
    }
}