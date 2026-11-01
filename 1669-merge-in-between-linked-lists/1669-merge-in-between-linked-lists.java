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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = temp1;
        for(int i = 0; i<=b; i++){
            if(i<a-1){
                temp1 = temp1.next;
            }
            temp2 = temp2.next;
        }
        temp1.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = temp2;
        return list1;
    }
}