class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] next=new int[arr.length];
        int[] prev=new int[arr.length];
        Stack<Integer> nse=new Stack<>();
        Stack<Integer> pse=new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            while(!nse.empty() && arr[nse.peek()]>=arr[i]) nse.pop();
            next[i]=(nse.empty()) ? arr.length : nse.peek();
            nse.push(i);
        }
        for(int i=0;i<arr.length;i++) {
            while(!pse.empty() && arr[pse.peek()]>arr[i]) pse.pop();
            prev[i]=(pse.empty()) ? -1 : pse.peek();
            pse.push(i);
        }
        long total=0,mod=1000000007;
        for(int i=0;i<arr.length;i++) {
            long a=i-prev[i];
            long b=next[i]-i;
            total=(total+(((a*b)%mod)*arr[i])%mod)%mod;
        }
        return (int)(total%mod);
    }
}