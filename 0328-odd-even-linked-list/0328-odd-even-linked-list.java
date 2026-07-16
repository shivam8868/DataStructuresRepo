/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListListNode(int val) { this.val = val; }
 *     ListListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // the logic is traverse the whole list and store into two liist by index even and odd then then merge iinto oddlist and point the head to it ok
        // if(head==null) {
        //     return null;
        // }
        // ListNode current = head;
        // ListNode odd = null;
        // ListNode even = null;
        // int index =1;
        // while(current!=null) {
        //     if(index%2!=0) {
        //         odd=current;
        //     }
        //     else {

        //         even=current;
        //     }
        //     current=current.next;
        //     index++;
        // }
        // ListNode oddTraverse = odd;
        // while(oddTraverse.next!=null) {
        //     oddTraverse=oddTraverse.next;
        // }
        // oddTraverse.next=even;
        // return odd;

        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // save start of even list

        // Rearrange nodes
        while (even != null && even.next != null) {
            odd.next = even.next; // link odd to next odd
            odd = odd.next; // move odd forward

            even.next = odd.next; // link even to next even
            even = even.next; // move even forward
        }

        // Attach even list after odd list
        odd.next = evenHead;

        return head;
    }
}