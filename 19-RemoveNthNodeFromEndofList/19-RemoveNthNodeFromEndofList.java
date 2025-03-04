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
        int counter = n;
        ListNode temp = head;
        ListNode prev = head;
        
        while(temp != null){
            if(n<0){
                prev = prev.next;
            }
            if(temp.next==null){
                if(n==1) return head.next;
                else
                    prev.next = prev.next.next;
            }
            temp = temp.next;
            
            n--;
        }
        
        return head;
    }

}