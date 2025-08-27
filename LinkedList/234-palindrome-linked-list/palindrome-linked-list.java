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
        if(head==null || head.next==null) return true;
        ListNode slow=head, fast=head;
        //findingMiddleElement
        while(fast.next!=null && fast.next.next!=null) { 
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverseOneHalf
        ListNode newHead=reverse(slow.next);
        ListNode second=newHead, first=head;
        //checkPallindrome
        while(second!=null){
            if(first.val!=second.val){
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        //revertIntoOriginal
        reverse(newHead);
        return true;
    }
    ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}