class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> front=new HashMap<>();
        HashMap<Character,Integer> back=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if (!front.containsKey(s.charAt(i))) {
                front.put(s.charAt(i),i);
            }
            if (!back.containsKey(t.charAt(i))) {
                back.put(t.charAt(i),i);
            }
            if(!front.get(s.charAt(i)).equals(back.get(t.charAt(i))))
            return false;
        }
        return true;
    }
}