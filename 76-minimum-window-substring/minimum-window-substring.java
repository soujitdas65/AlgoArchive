class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<t.length();i++) 
        mpp.put(t.charAt(i),mpp.getOrDefault(t.charAt(i),0)+1);
        int i=0,j=0,start=-1,cnt=0,minLen=Integer.MAX_VALUE;
        while(j<s.length()) {
            if(mpp.containsKey(s.charAt(j))) {
                if(mpp.get(s.charAt(j))>0) cnt++;
            }
            while(cnt==t.length()) {
                if(j-i+1<minLen) {
                    minLen=j-i+1;
                    start=i;
                }
                mpp.put(s.charAt(i),mpp.get(s.charAt(i))+1);
                if(mpp.get(s.charAt(i))>0) cnt--;
                i++;
            }
            mpp.put(s.charAt(j),mpp.getOrDefault(s.charAt(j),0)-1);
            j++;
        }
        return (start==-1) ? "":s.substring(start,start+minLen);
    }
}