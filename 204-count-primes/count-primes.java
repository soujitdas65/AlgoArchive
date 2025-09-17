class Solution {
    public int countPrimes(int n) {
        int[] num=new int[n];
        for(int i=3;i<n;i+=2) num[i]=1;
        for(int i=3;i*i<n;i+=2) {
            if(num[i]==1) {
                for(int j=i*i;j<n;j+=i) num[j]=0;
            }
        }
        int cnt=0;
        for(int i=3;i<n;i+=2) {
            if(num[i]==1) cnt++;
        }
        if(n>2) return cnt+1;
        return cnt;
    }
}