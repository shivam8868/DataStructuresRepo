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
    public void reorderList(ListNode head) {
        ListNode  mid = findMid(head);
        ListNode nextToMid=mid.next;
        mid.next=null;
        ListNode p1=head;
        ListNode p2=reverse(nextToMid);
        ListNode p1Next;
        while(p1!=null && p2!=null) {
            p1Next=p1.next;
            p1.next=p2;
            p1=p2;
            p2=p1Next;
        }
    }
    private ListNode findMid(ListNode head) {
        ListNode slow=head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null) {
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}