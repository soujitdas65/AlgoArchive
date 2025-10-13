class Solution {
    public int numberOfSubstrings(String s) {
        return character(s,3)-character(s,2);
    }
    int character(String s,int k) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        mpp.put('a',0);
        mpp.put('b',0);
        mpp.put('c',0);
        int i=0,j=0,cnt=0;
        while(j<s.length()) {
            mpp.put(s.charAt(j),mpp.get(s.charAt(j))+1);
            while(valid(mpp,k)) {
                mpp.put(s.charAt(i),mpp.get(s.charAt(i))-1);
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
    boolean valid(HashMap<Character,Integer> mpp,int k) {
        int cnt=0;
        for(char ch:mpp.keySet()) {
            if(mpp.get(ch)>0) cnt++;
        }
        if(cnt<=k) return false;
        return true;
    }
}