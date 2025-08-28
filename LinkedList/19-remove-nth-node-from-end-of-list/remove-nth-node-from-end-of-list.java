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
        ListNode temp=head, target=head, prev=null;
        int cnt=1;
        //locatingTarget
        while(temp.next!=null){
            if(cnt>=n) {
                prev=target;
                target=target.next;
            }
            cnt++;
            temp=temp.next;
        }
        if(cnt==n) head=head.next;
        else prev.next=target.next;
        return head;
    }
}