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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode  newHead = new ListNode(-1, head);
        ListNode dummy = newHead;

        ListNode fn = head, sn = head.next;
        while(fn != null && sn != null){
            ListNode temp = fn ;
            fn.next = sn.next;
            fn = fn.next;
            sn.next = temp;
            dummy.next = sn;
            if(fn != null ){
                sn = fn.next;

            }else{
                sn = null;
            }
            dummy = temp;
        }
    return newHead.next;
    }
}