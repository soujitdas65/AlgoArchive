class Solution {
    public void sortColors(int[] nums) {
        int i=0,a=0;
        while(a<3){
            for (int j=i;j<nums.length;j++){
                if (nums[j]==a) {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    i++;
                }
            }
            a++;
        }
    }
}