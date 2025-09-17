class Solution {
    public int countPrimes(int n) {
        int[] num=new int[n];
        for(int i=2;i<n;i++) num[i]=1;
        for(int i=2;i*i<=n;i++) {
            if(num[i]==1) {
                for(int j=i*i;j<n;j+=i) num[j]=0;
            }
        }
        int cnt=0;
        for(int i=2;i<n;i++) {
            if(num[i]==1) cnt++;
        }
        return cnt;
    }
}