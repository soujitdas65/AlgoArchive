class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0,xor2=0,l=nums.length;
        for(int i=1;i<=l;i++) {
            xor1^=nums[i-1];
            xor2^=i;
        }
        return xor1^xor2;
    }
}