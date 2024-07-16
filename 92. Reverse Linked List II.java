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
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        head.next = null;
        ListNode prev = head;
        while (next != null) {
            ListNode cur = next;
            next = cur.next;
            cur.next = prev;
            prev = cur;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode revs = null, revs_prev = null, revend = null, revend_next = null;
        int i = 1;
        ListNode cur = head;
        while (cur != null && i <= right) {
            if (i < left) {
                revs_prev = cur;
            }
            if (i == left) {
                revs = cur;
            }
            if (i == right) {
                revend_next = cur.next;
                revend = cur;
            }
            cur = cur.next;
            i++;
        }
        revend.next = null;
        revend = reverseList(revs);
        if (revs_prev != null) {
            revs_prev.next = revend;
        } else {
            head = revend;
        }
        revs.next = revend_next;
        return head;
    }
}
