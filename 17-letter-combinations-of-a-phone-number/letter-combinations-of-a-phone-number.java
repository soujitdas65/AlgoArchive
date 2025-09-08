class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        HashMap<Character,String> mpp=new HashMap<>();
        mapping(mpp);
        phoneNumber(result,mpp,digits,new StringBuilder(),0);
        return result;
    }
    void phoneNumber(List<String> result,HashMap<Character,String> mpp,String digits,StringBuilder str,int i) {
        if(i>=digits.length()) {
            if(!digits.isEmpty())result.add(str.toString());
            return;
        }
        String s=mpp.get(digits.charAt(i));
        for(char ch=s.charAt(0);ch<=s.charAt(s.length()-1);ch++) {
            //include
            str.append(ch);
            phoneNumber(result,mpp,digits,str,i+1);
            str.deleteCharAt(str.length()-1);
        }
    }
    void mapping(HashMap<Character,String> mpp) {
        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");
    }
}