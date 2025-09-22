class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int j=i;
            while(j<nums.length && nums[j]<=nums[i]) j++;
            if(j==nums.length) {
                j=0;
                while(j<i && nums[j]<=nums[i]) j++;
            }
            if(j==i) ans[i]=-1;
            else ans[i]=nums[j];
        }
        return ans;
    }
}