class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        for(int i:hand) mpp.put(i,mpp.getOrDefault(i,0)+1);
        while(!mpp.isEmpty()) {
            int temp=mpp.firstKey();
            for(int i=temp;i<temp+groupSize;i++) {
                if(!mpp.containsKey(i))return false;
                mpp.put(i,mpp.get(i)-1);
                if(mpp.get(i)==0) mpp.remove(i);
            }
        }
        return true;
    }
}