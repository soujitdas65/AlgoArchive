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
    public ListNode middleNode(ListNode head) {
        int cnt=1;
        ListNode temp=head;
        while(temp.next!=null){
            cnt++;
            if(cnt%2==0) head=head.next;
            temp=temp.next;
        }
        return head;
    }
}