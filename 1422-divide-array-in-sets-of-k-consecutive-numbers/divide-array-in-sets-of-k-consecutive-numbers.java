class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k!=0) return false;
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        for(int i:nums) mpp.put(i,mpp.getOrDefault(i,0)+1);
        while(!mpp.isEmpty()) {
            int ele=mpp.firstKey();
            mpp.put(ele,mpp.get(ele)-1);
            if(mpp.get(ele)==0) mpp.remove(ele);
            for(int i=1;i<k;i++) {
                if(!mpp.containsKey(ele+1)) return false;
                ele++;
                mpp.put(ele,mpp.get(ele)-1);
                if(mpp.get(ele)==0) mpp.remove(ele);
            }
        }
        return true;
    }
}


