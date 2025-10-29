class Solution {
    public boolean checkValidString(String s) {
        int min=0,max=0;
        for(char ch:s.toCharArray()) {
            if(ch=='(') {
                min++;
                max++;
            }
            else {
                if(min>0) min--;
                if(ch==')') {
                    max--;
                    if(max<0) return false;
                }
                else max++;
            }
        }
        return max>=0 && min==0;
    }
}