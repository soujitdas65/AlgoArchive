class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int index[] = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (mpp.containsKey(target - nums[i])) {
                index[0] = i;
                index[1] = mpp.get(target - nums[i]);
                return index;
            }
            mpp.put(nums[i], i);
        }
        return index;
    }
}