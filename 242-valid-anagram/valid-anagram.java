class Solution {
    public boolean isAnagram(String s, String t) {
        int num[]=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
            num[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(num[i]!=0) return false;
        }
        return true;
    }
}