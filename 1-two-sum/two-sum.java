class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            mpp.put(nums[i],i);
        }
        int index[]=new int[2];
        for (int i=0;i<nums.length;i++){
            mpp.remove(nums[i],i);
            if(mpp.containsKey(target-nums[i])) {
                index[0]=i;
                index[1]=mpp.get(target-nums[i]);
                break;
            }
        }
        return index;
    }
}