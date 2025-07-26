class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int l=nums.length;
        for(int i=0;i<l;i++){
            int freq=0;
            if(mpp.containsKey(nums[i])) freq=mpp.get(nums[i]);
            if(freq+1>l/3 && !list.contains(nums[i])) list.add(nums[i]);
            mpp.put(nums[i],freq+1);
        }
        return list;
    }
}