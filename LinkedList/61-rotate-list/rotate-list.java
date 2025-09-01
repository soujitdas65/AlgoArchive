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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int l=findLength(temp);
        if(l!=0) k=k%l;
        while(k-->0){
            while(temp.next.next!=null) temp=temp.next;
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
            temp=head;
        }
        return head;
    }
    int findLength(ListNode start) {
        int cnt=0;
        while(start!=null) {
            cnt++;
            start=start.next;
        }
        return cnt;
    }
}