class Solution {
    public int romanToInt(String s) {
        int[] roman = new int[26]; 
        roman['I'-'A'] = 1;
        roman['V'-'A'] = 5;
        roman['X'-'A'] = 10;
        roman['L'-'A'] = 50;
        roman['C'-'A'] = 100;
        roman['D'-'A'] = 500;
        roman['M'-'A'] = 1000;

        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            if(roman[s.charAt(i)-'A']<roman[s.charAt(i+1)-'A'])
            sum-=roman[s.charAt(i)-'A'];
            else sum+=roman[s.charAt(i)-'A'];
        }
        return sum+roman[s.charAt(s.length()-1)-'A'];
    }
}