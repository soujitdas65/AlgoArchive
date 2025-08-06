class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;
        reverse(nums,0,l-k-1);
        reverse(nums,l-k,l-1);
        reverse(nums,0,l-1);
    }
    void reverse(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}