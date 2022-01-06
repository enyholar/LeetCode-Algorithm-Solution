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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, current = null;
        int carry = 0;

        while( (l1!= null) && (l2!= null) )
        {
            int s = l1.val + l2.val + carry;

            carry = s / 10;   // Ten's place, becomes 0 if s < 10
            s = s % 10;       // Unit's place

            if( head == null )
            {
                head = new ListNode(s);
                current = head;
            }
            else
            {
                current.next = new  ListNode(s);
                current = current.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while ( l1 != null )
        {
            int s = l1.val + carry;
            carry = s / 10;
            s = s % 10;
            current.next = new ListNode(s);
            current = current.next;
            l1 = l1.next;
        }

        while( l2 != null )
        {
            int s = l2.val + carry;
            carry = s / 10;
            s = s % 10;
            current.next = new ListNode(s);
            current = current.next;
            l2 = l2.next;
        }

        if( carry != 0 )
            current.next = new ListNode(carry);
        
        System.out.println(head.val);

        return head;        
    }
}