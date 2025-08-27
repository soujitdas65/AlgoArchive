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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead=reverse(head);
        ListNode temp=newHead;
        if(n==1) newHead=newHead.next;
        int cnt=2;
        while(temp!=null) {
            if(cnt==n) {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            cnt++;
        }
        return reverse(newHead);
    }
    ListNode reverse(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newHead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}