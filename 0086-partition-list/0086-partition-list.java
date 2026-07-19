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
    public ListNode partition(ListNode head, int x) {
        // lets create two pointers one will store values less than x another will greater than or equal to x then will meage it 
        // if (head == null)
        //     return null;
        // if (head != null && head.next == null)
        //     return head;
        // ListNode head1 = null;
        // ListNode head2 = null;
        // ListNode dummyHead2 = head2;
        // ListNode current = head;
        // while (current != null) {
        //     if (current.val < x) {
        //         head1 = current;
        //         head1 = head1.next;
        //     } else {
        //         head2 = current;
        //         head2 = head2.next;
        //     }
        //     current = current.next;

        // }
        // head1 = dummyHead2;
        // head = head1;
        // return head;

        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode after = afterHead;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        after.next = null; // important to avoid cycle
        before.next = afterHead.next; // merge two lists

        return beforeHead.next;
    }
}