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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode countTraverse = head;
        // int count = 1;
        // while (countTraverse.next != null) {
        //     countTraverse = countTraverse.next;
        //     count++;
        // }
        // ListNode current = head;
        // ListNode prev = null;
        // for (int i = 1; i < count - n + 1; i++) {
        //     prev = current;
        //     current = current.next;
        // }
        // prev.next = current.next;
        // return head;

        // create a dummy node before head 
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode first=dummy;
        ListNode second=dummy;

        for(int i=0;i<=n;i++) {
            first=first.next;
        }

        // move both first and second until first reaches end
        while(first!=null) {
            first = first.next;
            second = second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }
}