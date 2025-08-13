class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++) 
        mpp.put(nums[i],i);
        for(int i=0;i<operations.length;i++){
            if(mpp.containsKey(operations[i][0])){
                int index=mpp.get(operations[i][0]);
                nums[index]=operations[i][1];
                mpp.remove(operations[i][0]);
                mpp.put(operations[i][1],index);
            }
        }
        return nums;
    }
}