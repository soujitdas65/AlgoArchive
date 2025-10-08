class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        int i=-1,j=0,max=Integer.MIN_VALUE;
        while(j<s.length()) {
            if(mpp.containsKey(s.charAt(j))) {
                if(i<mpp.get(s.charAt(j))) i=mpp.get(s.charAt(j));
            }
            mpp.put(s.charAt(j),j);
            System.out.println(i);
            max=Math.max(max,j-i);
            j++;
        }
        return max;
    }
}