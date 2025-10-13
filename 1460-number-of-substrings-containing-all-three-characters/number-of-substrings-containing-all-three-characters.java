class Solution {
    public int numberOfSubstrings(String s) {
        return character(s,3)-character(s,2);
    }
    int character(String s,int k) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        int i=0,j=0,cnt=0;
        while(j<s.length()) {
            mpp.put(s.charAt(j),mpp.getOrDefault(s.charAt(j),0)+1);
            while(mpp.size()>k) {
                mpp.put(s.charAt(i),mpp.get(s.charAt(i))-1);
                if(mpp.get(s.charAt(i))==0) mpp.remove(s.charAt(i));
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}