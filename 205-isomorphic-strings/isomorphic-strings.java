class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Character> front=new ArrayList<>();
        List<Character> back=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if (front.contains(s.charAt(i))) {
                if(back.get(front.indexOf(s.charAt(i)))!=t.charAt(i)) 
                return false;
            }
            if (back.contains(t.charAt(i))) {
                if(front.get(back.indexOf(t.charAt(i)))!=s.charAt(i)) 
                return false;
            }
            front.add(s.charAt(i));
            back.add(t.charAt(i));
        }
        return true;
    }
}