class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++) 
        min=Math.min(min,strs[i].length());
        int i=0,count=0;
        for(;i<min;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=strs[j-1].charAt(i)){
                    count=1;
                    break;
                }
            }
            if(count==1)break;
        }
        return strs[0].substring(0,i);
    }
}