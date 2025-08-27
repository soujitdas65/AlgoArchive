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
        ListNode tail=head;
        int cnt=0;
        while(tail!=null) {
            cnt++;
            tail=tail.next;
        }
        int target=cnt-n;
        if(target==0) return head.next;
        tail=head;
        while(target-->0){
            if(target==0) tail.next=tail.next.next;
            else tail=tail.next;
        }
        return head;
    }
}