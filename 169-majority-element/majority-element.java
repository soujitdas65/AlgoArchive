class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int x=0;
        for (int i=0;i<nums.length;i++){
            int freq=0;
            if (mpp.containsKey(nums[i])) freq=mpp.get(nums[i]);
            if (freq+1>nums.length/2) {
                x=nums[i];
                break;
            }
            mpp.put(nums[i],freq+1);
        }
        return x;
    }
}