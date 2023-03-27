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
    public ListNode reverse(ListNode head,int k,int length){
        if(length<k){
            return head;
        }
        int count=0;
        ListNode curr=head,prev=null,next=null;

        while(count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next=reverse(next,k,length-k);
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int length=0;
        ListNode curr =head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }

        return reverse(head,k,length);
    }
}
