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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode left=null, right=head.next;
        while(right!=null){
            head.next=left;
            left=head;
            head=right;
            right=right.next;
        }
        head.next=left;
        return head;
    }
}