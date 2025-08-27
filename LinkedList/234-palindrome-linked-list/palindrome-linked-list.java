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
        ListNode slow=head, fast=head, left=null, right=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow.next=left;
            left=slow;
            slow=right;
            right=right.next;
        }
        right=slow;
        ListNode mid=left;
        if(fast==null){ //even
            while(left!=null && slow!=null){
                if(slow.val!=left.val) return false;
                slow=slow.next;
                left=left.next;
                mid.next=right;
                right=mid;
                mid=left;
            }
        }
        else { //odd
            slow=slow.next;
            while(left!=null && slow!=null){
                if(slow.val!=left.val) return false;
                left=left.next;
                slow=slow.next;
                mid.next=right;
                right=mid;
                mid=left;
            }
        }
        return true;
    }
}