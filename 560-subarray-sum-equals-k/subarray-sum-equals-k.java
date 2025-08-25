class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; 
            count+=mpp.getOrDefault(sum-k,0);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}