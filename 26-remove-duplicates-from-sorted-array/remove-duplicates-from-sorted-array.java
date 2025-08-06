class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length,i=0;
        for (int j=1;j<l;j++){
            if(nums[i]!=nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}