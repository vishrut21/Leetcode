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
    public ListNode reverse(ListNode head){
        ListNode curr = head, prev = null;
        while(curr != null){
            ListNode ah = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ah;
        }
        return prev;
    }
    public void reorderList(ListNode head) {

        if(head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midHead = slow.next;
        slow.next = null;
        midHead = reverse(midHead);

        ListNode temp1 = head, read1 = null;
        ListNode temp2 = midHead, read2 = null;
        
        while(temp2 != null) {
        read1 = temp1.next;
        read2 = temp2.next;

        temp1.next = temp2;
        temp2.next = read1;

        temp1 = read1;
        temp2 = read2;
       
        }
      

    }
}