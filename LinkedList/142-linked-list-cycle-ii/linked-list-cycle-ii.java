/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return head;
        boolean cycle=false;
        ListNode slow=head, fast=head, start=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                cycle= true;
                break;
            }
        }
        if(cycle==false) return null;
        while(slow!=start){
            slow=slow.next;
            start=start.next;
        }
        return start;
    }
}