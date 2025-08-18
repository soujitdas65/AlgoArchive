class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> mpp=new TreeMap<>();
        for(int i=0;i<s.length();i++) {
          int freq=0;
          if(mpp.containsKey(s.charAt(i))) freq=mpp.get(s.charAt(i));
          mpp.put(s.charAt(i),freq+1);
        }
        String ans="";
        int i=0;
        while(i++<s.length()){
            for(char ele:mpp.keySet()){
                int n=mpp.get(ele);
                if(n==i){
                    int num=mpp.get(ele);
                    while(num-->0) ans=ele+ans;
                }
            }
        } 
        return ans;
    }
}