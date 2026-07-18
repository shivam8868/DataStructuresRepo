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
    public ListNode rotateRight(ListNode head, int k) {
        // lets try 
        // ListNode traverse=head;
        // int length=0;
        // while(traverse!=null) {
        //     count++;
        //     traverse=traverse.next;
        // }
        //   k = k % length;
        // if (k == 0) return head;
        // traverse=head;
        // for(int i=0;i<=k;i++) {
        //     traverse=traverse.next;
        // }
        // ListNode head2=traverse.next;
        // traverse.next=null;

        // ListNode current=head2;
        // while(current.next!=null) {
        //     current=current.next;
        // }
        // current.next=head;
        // head=head2;

        // return head;

                if (head == null || head.next == null || k == 0) return head;

        // Step 1: find length
        int length = 0;
        ListNode traverse = head;
        while (traverse != null) {
            length++;
            traverse = traverse.next;
        }

        // Step 2: normalize k
        k = k % length;
        if (k == 0) return head;

        // Step 3: find new head (length - k th node)
        traverse = head;
        for (int i = 1; i < length - k; i++) {
            traverse = traverse.next;
        }

        // Step 4: split and reconnect
        ListNode newHead = traverse.next;
        traverse.next = null;

        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return newHead;
    }
}