class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int i=0,j=0,maxLen=0;
        while(j<fruits.length) {
            mpp.put(fruits[j],mpp.getOrDefault(fruits[j],0)+1);
            if(mpp.size()>2) {
                mpp.put(fruits[i],mpp.getOrDefault(fruits[i],0)-1);
                if(mpp.get(fruits[i])==0) mpp.remove(fruits[i]);
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}