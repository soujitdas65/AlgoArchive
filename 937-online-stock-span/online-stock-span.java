class StockSpanner {
    Stack<Pair> st=new Stack<>();
    class Pair {
        int first,second;
        Pair(int i, int j) {
            this.first=i;
            this.second=j;
        }
    }
    public StockSpanner() {
        
    }
    public int next(int price) {
        int cnt=1;
        while(!st.empty() && st.peek().first<=price) cnt+=st.pop().second;
        st.push(new Pair(price,cnt));
        return cnt;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */