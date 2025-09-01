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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int l=findLength(temp);
        if(l==0 || l==1) return head;
        if(k%l==0) return head;
        k=l-k%l;
        //1stHalf
        while(k-->1) temp=temp.next;
        ListNode newHead=temp.next;
        temp.next=null;
        //2ndHalf
        temp=newHead;
        while(temp.next!=null) temp=temp.next;
        temp.next=head;
        return newHead;
    }
    int findLength(ListNode start) {
        int cnt=0;
        while(start!=null) {
            cnt++;
            start=start.next;
        }
        return cnt;
    }
}