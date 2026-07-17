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
    public ListNode deleteDuplicates(ListNode head) {
       if (head == null) return null;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (head != null) {
            // Check if current node is start of duplicates
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with this value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Connect prev to node after duplicates
                prev.next = head.next;
            } else {
                // No duplicate, move prev
                prev = prev.next;
            }
            head = head.next;
        }

        return dummy.next;

    }
}