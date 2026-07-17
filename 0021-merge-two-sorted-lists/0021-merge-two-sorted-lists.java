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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if (list1 == null && list2 == null)
        //     return null;
        // if (list1 != null && list2 == null)
        //     return list1;
        // if (list1 == null && list2 != null)
        //     return list2;
        // ListNode current1 = list1;
        // ListNode current2 = list2;
        // ListNode head = list1;
        // while (current1 != null && current2 != null) {
        //     if (current1.val < current2.val) {
        //         head = current1;
        //         current1 = current1.next;
        //     }
        //     if (current2.val < current1.val) {
        //         head = current2;
        //         current2 = current2.next;
        //     }
        //     head = head.next;
        // }
        // if (current1 == null && current2 == null) {
        //     return list1;
        // }
        // if (current1 == null) {
        //     head = current2;
        //     current2 = current2.next;
        //     head = head.next;
        // } else {
        //     head = current1;
        //     current1 = current1.next;
        //     head = head.next;
        // }
        // return list1;

        // Dummy node to simplify logic
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next; // skip dummy
    }
}