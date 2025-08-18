class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(char ch:s.toCharArray()) 
        mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        StringBuilder ans=new StringBuilder();
        int l=s.length();
        while(l-->0){
            for(char ele:mpp.keySet()){
                int n=mpp.get(ele);
                if(n==l+1){
                    while(n-->0) ans.append(ele);
                }
            }
        } 
        return ans.toString();
    }
}