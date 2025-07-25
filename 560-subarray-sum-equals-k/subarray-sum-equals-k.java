class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int sum=0,count=0;
        mpp.put(0,1);
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            int freq=1;
            if (mpp.containsKey(sum-k)) count+=mpp.get(sum-k);
            if (mpp.containsKey(sum)) freq+=mpp.get(sum);
            mpp.put(sum,freq);
        }
        return count;
    }
}