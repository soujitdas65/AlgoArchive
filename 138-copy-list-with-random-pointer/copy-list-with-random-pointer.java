/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null) {
            Node copyNode=new Node(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null) {
            if(temp.random==null) temp.next.random=null;
            else temp.next.random=temp.random.next;
            temp=temp.next.next;
        }
        temp=head;
        Node dummy=new Node(-1), copy=dummy;
        while(temp!=null) {
            copy.next=temp.next;
            copy=copy.next;
            temp.next=copy.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}