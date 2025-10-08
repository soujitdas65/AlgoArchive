class LRUCache {
    class Node {
        int key,value;
        Node next,prev;
        Node(int key, int value) {
            this.key=key;
            this.value=value;
            this.next=null;
            this.prev=null;
        }
    }
    HashMap<Integer,Node> mpp=new HashMap<>();
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key) {
        if(!mpp.containsKey(key)) return -1;
        Node node=mpp.get(key);
        deleteNode(node);
        insertNode(node);
        return node.value;
    }
    public void put(int key, int value) {
        if(mpp.containsKey(key)) {
            Node node=mpp.get(key);
            deleteNode(node);
            insertNode(node);
            node.value=value;
        }
        else {
            if(mpp.size()==capacity) {
                Node node=tail.prev;
                mpp.remove(node.key);
                deleteNode(node);
            }
            Node node=new Node(key,value);
            insertNode(node);
            mpp.put(key,node);
        }
    }
    void insertNode(Node node) {
        Node temp=head.next;
        node.next=temp;
        node.prev=head;
        head.next=node;
        temp.prev=node;
    }
    void deleteNode(Node node) {
        if(node.prev!=null) node.prev.next=node.next;
        if(node.next!=null) node.next.prev=node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */