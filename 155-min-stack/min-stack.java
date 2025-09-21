class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st=new Stack<>();
    }
    public void push(int val) {
        if(st.empty()) {
            st.push((long)val);
            min=val;
        }
        else if(val<min) {
            st.push((long)2*val-min);
            min=val;
        }
        else st.push((long)val);
    }
    public void pop() {
        long top=st.pop();
        if(top<min) min=2*min-top;
    }
    public int top() {
        long ele=st.peek();
        if(ele<min) return (int)min;
        return (int)ele;
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