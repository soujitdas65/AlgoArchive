class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0 && nums[i-1]>=nums[i])i--;
        if(i>0) {
            int j=nums.length-1;
            while(j>0 && nums[i-1]>=nums[j])j--;
            swap(nums,i-1,j);
        }
        reverse(nums,i,nums.length-1);
    }
    void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}