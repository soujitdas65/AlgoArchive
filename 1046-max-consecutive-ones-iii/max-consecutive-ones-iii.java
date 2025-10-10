class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,zero=0,max=Integer.MIN_VALUE;
        while(j<nums.length) {
            if(nums[j]==0) zero++;
            while(zero>k) {
                if(nums[i]==0) zero--;
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}