class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=strs[0].length();
        int i=0,count=0;
        for(;i<min;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()==0 || strs[j].charAt(i)!=strs[j-1].charAt(i)){
                    count=1;
                    break;
                }
                min=Math.min(min,strs[j].length());
            }
            if(count==1)break;
        }
        return strs[0].substring(0,i);
    }
}