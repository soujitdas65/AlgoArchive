class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        int i=-1,j=0,max=0;
        while(j<s.length()) {
            char ch=s.charAt(j);
            if(mpp.containsKey(ch) && i<mpp.get(ch)) i=mpp.get(ch);
            mpp.put(ch,j);
            max=Math.max(max,j-i);
            j++;
        }
        return max;
    }
}