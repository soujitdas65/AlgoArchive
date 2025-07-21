class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            mpp.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int t=nums[i];
            mpp.remove(t,i);
            if(mpp.containsKey(target-t)) {
                list.add(i);
                list.add(mpp.get(target-t));
                mpp.remove(t);
                mpp.remove(target-t);
            }
        }
        int ar[]=new int[list.size()];
        for (int i=0;i<list.size();i++) ar[i]=list.get(i);
        return ar;
    }
}