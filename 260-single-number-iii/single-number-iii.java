class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i:nums) mpp.put(i,mpp.getOrDefault(i,0)+1);
        int j=0;
        for(int i:mpp.keySet()) {
            if(mpp.get(i)==1) {
                ans[j]=i;
                j++;
            }
        }
        return ans;
    }
}