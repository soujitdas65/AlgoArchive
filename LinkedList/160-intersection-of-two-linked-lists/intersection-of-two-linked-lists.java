/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode temp1=headA, temp2=headB;
        int len1=findlength(temp1), len2=findlength(temp2);
        if(len1>=len2) {
            int shift=len1-len2;
            while(shift-->0) temp1=temp1.next;
        }
        else {
            int shift=len2-len1;
            while(shift-->0) temp2=temp2.next;
        }
        while(temp1!=temp2) {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1==null || temp2==null) return null;
        return temp1;
    }
    int findlength(ListNode head) {
        int cnt=0;
        while(head!=null) {
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}