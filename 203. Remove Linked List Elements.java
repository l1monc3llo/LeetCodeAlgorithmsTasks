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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        if (head == null) return null;
        ListNode prev = head, next = head.next;
        while (next != null){
            if (next.val == val){
                prev.next = next.next;
            }
            else{
                
                prev = next;
            }
            next = next.next;

        }
        return head;

    }
}
