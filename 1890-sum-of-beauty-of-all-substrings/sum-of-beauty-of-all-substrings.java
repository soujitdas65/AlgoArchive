class Solution {
    public int beautySum(String s) {
        int sum=0;
        for (int i=0;i<s.length();i++){
            HashMap<Character,Integer> mpp=new HashMap<>();
            for (int j=i+1;j<=s.length();j++) {
                mpp.put(s.charAt(j-1),mpp.getOrDefault(s.charAt(j-1),0)+1);
                int high=1,low=s.length();
                for(char ch:mpp.keySet()) {
                    int freq=mpp.get(ch);
                    low=Math.min(freq,low);
                    high=Math.max(freq,high);
                }
                sum+=high-low;
            }
        }
        return sum;
    }
}