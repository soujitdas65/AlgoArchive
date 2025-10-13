class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return nice(nums,k)-nice(nums,k-1);
    }
    int nice(int[] nums, int k) {
        int i=0,j=0,cnt=0,ans=0;
        while(j<nums.length) {
            if((nums[j] & 1)==1) cnt++;
            while(cnt>k) {
                if((nums[i] & 1)==1) cnt--;
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}