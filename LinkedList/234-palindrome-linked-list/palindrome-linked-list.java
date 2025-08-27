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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        if(head.next.next==null){
            if(head.val==head.next.val) return true;
            else return false;
        }
        ListNode slow=head, fast=head, left=null, right=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow.next=left;
            left=slow;
            slow=right;
            right=right.next;
        }
        if(fast==null){
            while(left!=null || slow!=null){
                if(slow.val!=left.val) return false;
                slow=slow.next;
                left=left.next;
            }
        }
        else {
            while(left!=null && right!=null){
                if(right.val!=left.val) return false;
                left=left.next;
                right=right.next;
            }
        }
        return true;
    }
}