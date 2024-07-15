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
    public ListNode reverseList(ListNode node) {
        if (node == null) return null;
        if (node.next == null) return node;
        ListNode head = reverseList(node.next);
        ListNode temp = node.next;
        temp.next = node;
        node.next = null;
        return head;


    }
}
