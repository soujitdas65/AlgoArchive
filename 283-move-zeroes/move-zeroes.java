class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length,j=0;
        int ar[]=new int[n];
        for (int i=0;i<n;i++) {
            if (nums[i]!=0) {
                ar[j]=nums[i];
                j++;
            }
        }
        for (int i=0;i<n;i++) {
            nums[i]=ar[i];
        }

    }
}