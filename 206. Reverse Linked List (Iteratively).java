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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode next = head.next;
        head.next = null;
        ListNode prev = head;
        while (next != null){
            ListNode cur = next;
            next = cur.next;
            cur.next = prev;
            prev = cur;
        }
        return prev;

    }
}
