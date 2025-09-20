class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    public void push(int val) {
        st.push(val);
        if(min.empty() || min.peek()>=val) min.push(val);
    }
    public void pop() {  
        if(min.peek().equals(st.pop())) min.pop();
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return min.peek();
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