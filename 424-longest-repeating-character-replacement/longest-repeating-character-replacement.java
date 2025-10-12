class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        int i=0,j=0,maxFreq=0,maxLen=0;
        while(j<s.length()) {
            mpp.put(s.charAt(j),mpp.getOrDefault(s.charAt(j),0)+1);
            maxFreq=Math.max(maxFreq,mpp.get(s.charAt(j)));
            while(j-i+1-maxFreq>k) {
                mpp.put(s.charAt(i),mpp.get(s.charAt(i))-1);
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}