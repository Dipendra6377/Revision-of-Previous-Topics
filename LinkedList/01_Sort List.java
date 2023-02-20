class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=null;

        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;

        ListNode l1=sortList(head);
        ListNode l2= sortList(slow);

        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                temp.next = l2;
                l2=l2.next;
            }
            else{
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
        }
        if(l1!=null){
            temp.next=l1;

        }
        if(l2!=null){
            temp.next=l2;
        }
        return dummy.next;
    }
}
