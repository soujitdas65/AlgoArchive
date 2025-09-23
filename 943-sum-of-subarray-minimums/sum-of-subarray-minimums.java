class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] next=new int[n];
        int[] prev=new int[n];
        Stack<Integer> nse=new Stack<>();
        Stack<Integer> pse=new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while(!nse.empty() && arr[nse.peek()]>=arr[n-i-1]) nse.pop();
            while(!pse.empty() && arr[pse.peek()]>arr[i]) pse.pop();
            next[n-i-1]=(nse.empty()) ? n : nse.peek();
            prev[i]=(pse.empty()) ? -1 : pse.peek();
            nse.push(n-i-1);
            pse.push(i);
        }
        long total=0,mod=1000000007;
        for(int i=0;i<arr.length;i++) {
            long a=i-prev[i];
            long b=next[i]-i;
            total=(total+a*b%mod*arr[i]%mod)%mod;
        }
        return (int)(total%mod);
    }
}