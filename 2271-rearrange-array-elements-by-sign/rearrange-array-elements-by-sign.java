class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int pos=0,neg=1;
        int n[]=new int[l];
        for(int i=0;i<l;i++){
            if(nums[i]>=0) {
                n[pos]=nums[i];
                pos=pos+2;
            }
            else {
                n[neg]=nums[i];
                neg=neg+2;
            }
        }
        return n; 
    }
}