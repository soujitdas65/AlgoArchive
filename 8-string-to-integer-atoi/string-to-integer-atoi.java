class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        StringBuilder str=new StringBuilder();
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')i++;
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+'))
        str.append(s.charAt(i++));
        boolean blank=true;
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                str.append(s.charAt(i++));
                blank=false;
            }
            else break;
        }
        if(blank==true) return 0;
        int result;
        try{
            result=Integer.valueOf(str.toString());
        }catch(Exception e){
            if(str.length()!=0 && str.charAt(0)=='-') 
            return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        return result;
    }
}