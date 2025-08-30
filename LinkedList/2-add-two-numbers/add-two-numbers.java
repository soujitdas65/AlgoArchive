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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(length(l1)<length(l2)) return addTwoNumbers(l2,l1);
        ListNode temp1=l1, temp2=l2,prev=null;
        int carry=0;
        while(temp1!=null && temp2!=null) {
            int sum=temp1.val+temp2.val+carry;
            temp1.val=sum%10;
            carry=sum/10;
            prev=temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null) {
            int sum=temp1.val+carry;
            temp1.val=sum%10;
            carry=sum/10;
            prev=temp1;
            temp1=temp1.next; 
        }
        if(carry!=0) prev.next=new ListNode(carry); 
        return l1;
    }
    int length(ListNode temp) {
        int cnt=0;
        while(temp!=null) {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
}