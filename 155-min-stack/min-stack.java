class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st=new Stack<>();
        min=Long.MAX_VALUE;
    }
    public void push(int val) {
        long ele=(long)val;
        if(st.empty()) min=ele;
        st.push(ele-min);
        if(min>ele) min=ele;
    }
    public void pop() {
        if(st.peek()<0) min=min-st.peek();
        st.pop();
    }
    public int top() {
        if(st.peek()<0) return (int)min;
        return (int)(min+st.peek());
    }
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */