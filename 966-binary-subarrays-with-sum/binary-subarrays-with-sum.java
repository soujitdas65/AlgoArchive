class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int sum=0,cnt=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(mpp.containsKey(sum-goal)) cnt+=mpp.get(sum-goal);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}