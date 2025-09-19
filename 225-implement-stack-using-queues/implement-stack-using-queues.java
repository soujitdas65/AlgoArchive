class MyStack {
    Queue<Integer> q;
    int size;
    public MyStack() {
        q=new LinkedList<>();
        size=0;
    }
    public void push(int x) {
        q.add(x);
        size++;
        for(int i=1;i<size;i++) q.add(q.remove());
    }  
    public int pop() {
        size--;
        return q.remove();
    } 
    public int top() {
        return q.element();
    }  
    public boolean empty() {
        return size==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */