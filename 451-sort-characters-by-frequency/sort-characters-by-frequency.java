class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++) {
          int freq=0;
          if(mpp.containsKey(s.charAt(i))) freq=mpp.get(s.charAt(i));
          mpp.put(s.charAt(i),freq+1);
        }
        StringBuilder ans=new StringBuilder();
        int i=s.length();
        while(i-->0){
            for(char ele:mpp.keySet()){
                int n=mpp.get(ele);
                if(n==i+1){
                    while(n-->0) ans.append(ele);
                }
            }
        } 
        return ans.toString();
    }
}