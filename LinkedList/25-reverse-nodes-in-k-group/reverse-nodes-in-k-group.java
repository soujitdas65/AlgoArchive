/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start=head, kthNode=findkth(start,k);
        if(kthNode!=null) head=kthNode;
        else return head;
        ListNode prevStart=null;
        while(kthNode!=null) {
            ListNode nextStart=kthNode.next;
            kthNode.next=null;
            ListNode prev=reverse(start);
            if(prevStart!=null) prevStart.next=prev;
            prevStart=start;
            start=nextStart;
            kthNode=findkth(start,k);
        }
        prevStart.next=start;
        return head;
    }
    ListNode findkth(ListNode start,int k) {
        for(int i=1;i<k;i++) {
            if(start==null) return start;
            start=start.next;
        }
        return start;
    }
    ListNode reverse(ListNode mid) {
        ListNode back=null, front=mid;
        while(mid!=null) {
            front=front.next;
            mid.next=back;
            back=mid;
            mid=front;
        }
        return back;
    }
}