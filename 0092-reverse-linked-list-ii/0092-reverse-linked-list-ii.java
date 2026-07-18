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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     if (head == null || left == right) return head;

        // Step 1: Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 2: Move prev to node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 3: Reverse sublist
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevSub = null;

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prevSub;
            prevSub = curr;
            curr = next;
        }

        // Step 4: Reconnect
        prev.next.next = curr;   // tail of reversed sublist connects to remaining list
        prev.next = prevSub;     // prev connects to new head of reversed sublist

        return dummy.next;
    }
}