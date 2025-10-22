class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k!=0) return false;
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        for(int i:nums) mpp.put(i,mpp.getOrDefault(i,0)+1);
        while(!mpp.isEmpty()) {
            int i=mpp.firstKey();
            for(int j=i;j<i+k;j++) {
                if(!mpp.containsKey(j)) return false;  
                mpp.put(j,mpp.get(j)-1);
                if(mpp.get(j)==0) mpp.remove(j);           
            }
        }
        return true;
    }
}


