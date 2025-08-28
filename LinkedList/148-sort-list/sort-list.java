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
    public ListNode sortList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        //storingElements
        ListNode temp=head;
        while(temp!=null) {
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        //updateList
        temp=head;
        for(int i:list) {
            temp.val=i;
            temp=temp.next;
        }
        return head;
    }
}