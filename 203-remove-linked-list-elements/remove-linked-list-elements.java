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
    public ListNode removeElements(ListNode head, int val) {
        ListNode i=head;
        while(head!=null && head.val==val) head=head.next;
        if(head==null) return null;
        ListNode j=i.next;
        while(j!=null){
            if(j.val==val){
                j=j.next;
                i.next=j;
            }
            else {
                i=i.next;
                j=j.next;
            }
        }
        return head;
    }
}