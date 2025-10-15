class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(char ch:t.toCharArray()) 
        mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        int i=0,j=0,start=-1,cnt=0,minLen=Integer.MAX_VALUE;
        while(j<s.length()) {
            if(mpp.containsKey(s.charAt(j))) {
                if(mpp.get(s.charAt(j))>0) cnt++;
                mpp.put(s.charAt(j),mpp.get(s.charAt(j))-1);
            }
            while(cnt==t.length()) {
                if(j-i+1<minLen) {
                    minLen=j-i+1;
                    start=i;
                }
                if(mpp.containsKey(s.charAt(i))) {
                    mpp.put(s.charAt(i),mpp.get(s.charAt(i))+1);
                    if(mpp.get(s.charAt(i))>0) cnt--;
                }
                i++;
            }
            j++;
        }
        return (start==-1) ? "":s.substring(start,start+minLen);
    }
}