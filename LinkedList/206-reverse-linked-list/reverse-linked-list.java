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
        return reverse(left,right,head);
    }
    ListNode reverse(ListNode left, ListNode right, ListNode mid){
        if(right==null) {
            mid.next=left;
            return mid;
        }
        mid.next=left;
        left=mid;
        mid=right;
        right=right.next;
        return reverse(left,right,mid);
    }
}