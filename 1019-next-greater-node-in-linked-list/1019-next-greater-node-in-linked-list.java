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
    public int[] nextLargerNodes(ListNode head) {
        // int[] array = new int[];
        // if(head==null) return array;
        // if(head!=null && head.next==null) {
        //     array[0]=0;
        //     return array;
        // }
        // // step 1
        // // reverse the list
        // ListNode current=head;
        // ListNode prev=null;
        // while(curren!=null) {
        //     ListNode next=current.next;
        //     current.next=prev;
        //     prev=current;
        //     current=next;
        // }
        // current=prev.next;
        // array[0]=0;
        // int index=1;
        // while(current!=null) {
        //     ListNode max=current;
        //     if(current.val<max)
        // }

        // return array;

        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int n = values.size();
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && values.get(i) > values.get(stack.peek())) {
                ans[stack.pop()] = values.get(i);
            }
            stack.push(i);
        }
        return ans;
    }
}