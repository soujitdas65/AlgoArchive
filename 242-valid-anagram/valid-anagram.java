class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int freq=0;
            if(mpp.containsKey(s.charAt(i)))
            freq=mpp.get(s.charAt(i));
            mpp.put(s.charAt(i),freq+1);
        }
        for(int i=0;i<t.length();i++){
            int freq=0;
            if(mpp.containsKey(t.charAt(i)))
            freq=mpp.get(t.charAt(i));
            mpp.put(t.charAt(i),freq-1);
        }
        for(char ch:mpp.keySet()) {
            if(mpp.get(ch)!=0) return false;
        }
        return true;
    }
}