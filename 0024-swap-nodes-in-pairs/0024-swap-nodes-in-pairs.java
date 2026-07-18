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
    public ListNode swapPairs(ListNode head) {
        // if(head==null) return null;
        // if(head!=null && head.next==null) return head;
        // ListNode current=head;
        // ListNode next=null;
        // while(current.next!=null) {
        //     next=current.next;
        //     current.next=current;
        //     current=next.next;

        // } 
        // return head;

        
        // dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            // nodes to swap
            ListNode first = prev.next;
            ListNode second = first.next;

            // swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // move prev forward
            prev = first;
        }

        return dummy.next;
    }
}