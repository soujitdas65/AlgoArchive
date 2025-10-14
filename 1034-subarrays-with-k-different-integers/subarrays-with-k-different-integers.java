class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return goodSubArray(nums,k)-goodSubArray(nums,k-1);
    }
    int goodSubArray(int[] nums, int k) {
        if(k==0) return 0;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int i=0,j=0,cnt=0;
        while(j<nums.length) {
            mpp.put(nums[j],mpp.getOrDefault(nums[j],0)+1);
            while(mpp.size()>k) {
                mpp.put(nums[i],mpp.get(nums[i])-1);
                if(mpp.get(nums[i])==0) mpp.remove(nums[i]);
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}