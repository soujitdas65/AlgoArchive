class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            int freq1=0,freq2=0;
            if(mpp.containsKey(s.charAt(i)))
            freq1=mpp.get(s.charAt(i));
            mpp.put(s.charAt(i),freq1+1);
            if(mpp.containsKey(t.charAt(i)))
            freq2=mpp.get(t.charAt(i));
            mpp.put(t.charAt(i),freq2-1);
        }
        for(char ch:mpp.keySet()) {
            if(mpp.get(ch)!=0) return false;
        }
        return true;
    }
}