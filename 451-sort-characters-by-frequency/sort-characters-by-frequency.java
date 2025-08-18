class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(char ch:s.toCharArray()) 
        mpp.put(ch,mpp.getOrDefault(ch,0)+1);

        List<Character> bucket[]=new List[s.length()+1];
        for(char ch:mpp.keySet()){
            int num=mpp.get(ch);
            if(bucket[num]==null) bucket[num]=new ArrayList<>();
            bucket[num].add(ch);
        }

        StringBuilder str=new StringBuilder();
        for(int i=s.length();i>0;i--){
            if(bucket[i]!=null){
                for(char ch:bucket[i]){
                    int num=i;
                    while(num-->0) str.append(ch);
                }
            }
        }
        return str.toString();
    }
}