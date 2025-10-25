class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        for(int i=0;i<s.length;i++) {
            while(j<g.length && i<s.length && g[j]<=s[i]) {
                i++;
                j++;
            }
        }
        return j;
    }
}