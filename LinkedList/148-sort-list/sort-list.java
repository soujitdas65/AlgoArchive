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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=middle(head), tail=mid.next;
        mid.next=null;
        head=sortList(head);
        tail=sortList(tail);
        return merge(head, tail);
    }
    ListNode middle(ListNode head) {
        ListNode slow=head, fast=head.next.next;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode merge(ListNode head, ListNode tail) {
        ListNode dummy=new ListNode(Integer.MAX_VALUE) ,temp=dummy;
        while(head!=null && tail!=null) {
            if(head.val<=tail.val) {
                temp.next=head;
                temp=temp.next;
                head=head.next;
            }
            else {
                temp.next=tail;
                temp=temp.next;
                tail=tail.next;
            }
        }
        if(head!=null) temp.next=head;
        else temp.next=tail;
        return dummy.next;
    }
}
