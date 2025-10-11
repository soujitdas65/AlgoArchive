class LFUCache {
    class Node {
        int key,value,freq=1;
        Node next,prev;
        Node(int key,int value) {
            this.key=key;
            this.value=value;
        }
    }
    class DoublyLinkedList {
        Node head,tail;
        int size;
        DoublyLinkedList() {
            head=new Node(0,0);
            tail=new Node(0,0);
            head.next=tail;
            tail.prev=head;
            size=0;
        }
        void addNode(Node node) {
            node.next=head.next;
            node.prev=head;
            head.next.prev=node;
            head.next=node;
            size++;
        }
        void removeNode(Node node) {
            node.prev.next=node.next;
            node.next.prev=node.prev;
            size--;
        }
        Node removeLast() {
            if(size==0) return null;
            Node node=tail.prev;
            removeNode(node);
            return node;
        }
        boolean isEmpty() {
            return size==0;
        }
    }
    HashMap<Integer,Node> keyMap;
    HashMap<Integer,DoublyLinkedList> freqMap;
    int capacity,minFreq,size;
    public LFUCache(int capacity) {
        this.capacity=capacity;
        this.minFreq=0;
        this.size=0;
        keyMap=new HashMap<>();
        freqMap=new HashMap<>();
    }
    public int get(int key) {
        if(!keyMap.containsKey(key)) return -1;
        Node node=keyMap.get(key);
        updateFreq(node);
        return node.value;
    }
    public void put(int key, int value) {
        if(keyMap.containsKey(key)) {
            Node node=keyMap.get(key);
            node.value=value;
            updateFreq(node);
        }
        else {
            if(size==capacity) {
                DoublyLinkedList minList=freqMap.get(minFreq);
                Node last=minList.removeLast();
                keyMap.remove(last.key);
                size--;
            }
            Node node=new Node(key,value);
            keyMap.put(key,node);
            if(!freqMap.containsKey(1)) 
            freqMap.put(1,new DoublyLinkedList());
            freqMap.get(1).addNode(node);
            minFreq=1;
            size++;
        }
    }
    void updateFreq(Node node) {
        DoublyLinkedList oldList=freqMap.get(node.freq);
        oldList.removeNode(node);
        if(node.freq==minFreq && oldList.isEmpty()) minFreq++;
        node.freq++;
        if(!freqMap.containsKey(node.freq)) 
        freqMap.put(node.freq,new DoublyLinkedList());
        freqMap.get(node.freq).addNode(node);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */