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
     ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // save next
            current.next = prev;          // reverse link
            prev = current;               // move prev forward
            current = next;               // move current forward
        }

        return prev; // new head of reversed list   
    }
}