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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val>list2.val) return mergeTwoLists(list2, list1);
        ListNode prev=list1, head=list1;
        list1=list1.next;
        while(list1!=null && list2!=null) {
            if(list1.val<list2.val) list1=list1.next;
            else {
                ListNode back=list2;
                list2=list2.next;
                prev.next=back;
                back.next=list1;
            }
            prev=prev.next;
        }
        if(list2!=null) prev.next=list2;
        return head;
    }
}